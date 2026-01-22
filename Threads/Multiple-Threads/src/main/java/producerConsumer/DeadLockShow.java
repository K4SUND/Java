package producerConsumer;


import java.util.Random;

//hold single message
class Message {

    // this is shared
    // someone produce this
    // someone read this
    private String text;
    private boolean hasText = false;

    // this method access to critical section
    // therefore add synchronized
    public synchronized String readText() {
        while (!hasText) {
            // loop until there is a message
        }
        // if there is a message it comes to here
        hasText = false;
        return text;
    }


    //same for write
    public synchronized void writeText(String text) {
        while (hasText) {

        }
        hasText = true;
        this.text = text;
    }

}


// producer
// write
class Producer implements Runnable {

    private Message writingMessage;
    private String text = """
            Hello world,
            Good morning,
            Bye Bye,
            """;

    public Producer(Message writingMessage) {
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
class Consumer implements Runnable {
    private Message readingMessage;

    public Consumer(Message readingMessage) {
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

public class DeadLockShow {

    public static void main(String[] args) {


        //shared message object
        Message message = new Message();

        //work same message object
        //reader
        Thread reader = new Thread(new Consumer(message));
        //writer
        Thread writer = new Thread(new Producer(message));

        reader.start();
        writer.start();


    }
}
