package advancedConcurrency;

import java.util.concurrent.TimeUnit;

public class CachedData {

//    private boolean flag = false;

    //add volatile  - - avoid thread caching, only for main memory
    private volatile boolean flag = false;


    //1. toggle --> flag - true
    public void toggleFlag(){
        flag = !flag;
    }

    public boolean isReady(){
        return flag;
    }

    public static void main(String[] args) {
        //instance
        CachedData cachedData = new CachedData();

        //thread 1
        //lamda function --  inside run ()
        Thread writeThread = new Thread(()->{
            //sleep
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
           //toggle
//            System.out.println("(W)Flag set to true");  // so because of below thing this is good  - but actualy 34 line it changes the flag
            cachedData.toggleFlag();
            System.out.println("(W)Flag set to "+cachedData.isReady());    // in meantime it runs the readthread and it get the flag is true and there code run
        });

        Thread readThread = new Thread(()->{
            //1. flag - false
            while(!cachedData.isReady()){

//                System.out.println("Waiting for flag to be true");   // this is influence to flush the caches
            }

            System.out.println("Loop is over");
            System.out.println("(R)Flag set to true");
        });

        //
        writeThread.start();
        readThread.start();

    }

}


// flag = false
//thread 1  -- sleep (1s) and toggle (false-> true    true--fasle )
//thread 2   -- flag(false)  ---> loop
//                -- flag(true) --> close the function
