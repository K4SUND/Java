package Unknown;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //main thread
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main thread is running");


        //another thread -> runnable lambDA expression
        Thread customThread = new Thread(()->{
            //new Thread
            String tName = Thread.currentThread().getName();
            System.out.println(tName+" is running");
            for(int i=0;i<10;i++)
            {
                System.out.print(".");
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e)
                {
                    System.out.println(tName+" is interrupted");
                    return;
                }

            }
            System.out.println(tName+" is finished");
        });


        //in above it only creates the thread
        //now have to start
        System.out.println(customThread.getName()+" is started");
        customThread.start();


        try {
            System.out.println("Main thread is sleep for 1 sec");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }

        //here I interrupt the new thread (custom thread)
        customThread.interrupt();
        System.out.println("Main thread is start again");
    }
}