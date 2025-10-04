package unknown;

import java.util.concurrent.TimeUnit;

public class StopWatch {

    private TimeUnit timeUnit;
    //version 2 --> shared instance variable
//    private int i;

    public StopWatch(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }



    //function
    public void countDown(int unitCount){
        String threadName = Thread.currentThread().getName();

        // threadColor object is now ThreadColor.ANSI_RESET ( color = "\u001B[0m" )
        ThreadColor threadColor = ThreadColor.ANSI_RESET;

        try{
            //change the color ( for now the color is "\u001B[0m" )
            threadColor = ThreadColor.valueOf(threadName);

        }catch (IllegalArgumentException e){
            // thread name is not compatible with color
            System.out.println("bad color");
        }

        String color = threadColor.color();

        //version one --> local variable ( thread safe )
        for( int i = unitCount ; i>0 ; i--){
            try{
                //tell do 1 sec by 1 sec
                timeUnit.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println(color+threadName+" Thread : i = "+i);
        }

        /*
        // version 2 -- shared instance variable

        for( int i = unitCount ; i>0 ; i--){
            try{
                //tell do 1 sec by 1 sec
                timeUnit.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println(color+threadName+" Thread : i = "+i);
        }
         */



    }

    public void countDown() {
        System.out.println("StopWatch");
        countDown(5);
    }
}
