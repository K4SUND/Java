package producerConsumer;

import java.util.Random;


//hold single message
class MessageNew {

    // this is shared
    // someone produce this
    // someone read this
    private String text;
    private boolean hasText = false;

    // this method access to critical section
    // therefore add synchronized
    public synchronized String readText() {

        // hasText - flag checks and continue to wait
        // therefore waking up and check here and again wait or doing



        while (!hasText) {
            // loop until there is a message
            try {
                wait(); // then it release the lock
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        // if there is a message it comes to here
        hasText = false;
        notifyAll();
        return text;
    }


    //same for write
    public synchronized void writeText(String text) {
        while (hasText) {

            // hasText - flag checks and continue to wait
            // therefore waking up and check here and again wait or doing


            try {
                wait(); // then it release the lock
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        hasText = true;
        notifyAll();
        this.text = text;

    }

}

// producer
// write
class ProducerNew implements Runnable {

    private MessageNew writingMessage;
    private String text = """
            Hello world,
            Good morning,
            Bye Bye,
            """;

    public ProducerNew(MessageNew writingMessage) {
        this.writingMessage = writingMessage;
    }

    @Override
    public void run() {

        Random random = new Random();

        String[] messages = text.split(",");
        for (int i = 0; i < messages.length; i++) {
            writingMessage.writeText(messages[i]);
            try {
                Thread.sleep(random.nextInt(500, 2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        writingMessage.writeText("Finished");

    }
}

// consumer
// read
class ConsumerNew implements Runnable {
    private MessageNew readingMessage;

    public ConsumerNew(MessageNew readingMessage) {
        this.readingMessage = readingMessage;
    }



    @Override
    public void run() {
        Random random = new Random();
        String latestMessage = "";
        do {
            try {
                Thread.sleep(random.nextInt(500, 2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            latestMessage = readingMessage.readText();
            System.out.println(latestMessage);

        } while (!latestMessage.equals("Finished"));

    }
}


public class DeadLockMitigation {

    public static void main(String[] args) {


        //shared message object
        MessageNew message = new MessageNew();

        //work same message object
        //reader
        Thread reader = new Thread(new ConsumerNew(message));
        //writer
        Thread writer = new Thread(new ProducerNew(message));

        reader.start();
        writer.start();


    }
}

