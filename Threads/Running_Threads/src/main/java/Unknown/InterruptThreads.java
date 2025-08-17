package Unknown;

public class InterruptThreads {

    public static void main(String[] args) {

        //main thread


        //custom thread
        Thread customThread = new Thread (()->{

            String tName = Thread.currentThread().getName();
            System.out.println(tName+" should take 10 dots to run.");

            for(int i=0;i<10;i++)
            {
                System.out.print(".");
                try{
                    Thread.sleep(500);
                    System.out.println("A. State : "+Thread.currentThread().getState());
                } catch (InterruptedException e) {
                    System.out.println(tName+" is interrupted");
                    System.out.println("A1. State : "+Thread.currentThread().getState());
                    return;
                }
            }
            System.out.println(tName+" Completed");

        });

        System.out.println(customThread.getName()+" is starting");
        customThread.start();


        //interrupt custom thread
        //if custom thread works more than 3 sec
        long now = System.currentTimeMillis();
        while(customThread.isAlive()){
            System.out.println("waiting for thread to complete");
            try{
                //main thread
//                System.out.println("Now:"+Thread.currentThread().getName());
                Thread.sleep(1000);
                System.out.println("B. State :"+customThread.getState());

                if(System.currentTimeMillis() - now > 2000)
                {
                    customThread.interrupt();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("C. state is "+customThread.getState());




    }
}
