package Unknown;

public class Join {
    public static void main(String[] args) {
        //main thread


        //custom thread -> download
        Thread customThread = new Thread (()->{

            String tName = Thread.currentThread().getName();
            System.out.println(tName+" should take 10 dots to run.");

            for(int i=0;i<10;i++)
            {
                System.out.print(".");
                try{
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                    System.out.println(tName+" is interrupted");
                    //
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            System.out.println(tName+" Completed");

        });


        //custom thread -> install
        Thread customThreadTwo = new Thread(()->{
            try{
                for(int i=0;i<3;i++)
                {
                    Thread.sleep(250);
                    System.out.println("Installation step "+(i+1)+" is completed");
                }

            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        },"InstallationThread");

        //custom thread -> look for time threshold

        Thread customThreadThree = new Thread(()->{

            //interrupt custom threadTwo(download thread)
            //if custom threadTwo works more than 3 sec
            long now = System.currentTimeMillis();


            while(customThread.isAlive()){

                try{
                    //main thread

                    Thread.sleep(1000);


                    if(System.currentTimeMillis() - now > 2000)
                    {
                        customThread.interrupt();
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }


        });



        System.out.println(customThread.getName()+" is starting");
        // download thread
        customThread.start();

        // install thread
        customThreadThree.start();







        try{
            //current thread -> main
            //current thread is paused and wait for "customThread" to finish.
            customThread.join();
        }catch (InterruptedException e)
        {
           throw new RuntimeException(e);
        }


        if(!customThread.isInterrupted())
        {
            customThreadTwo.start();
        }else {
            System.out.println("Previous thread is interrupted, "+customThreadTwo.getName()+" can't run" );
        }






    }

}
