package Unknown;

import static java.lang.Thread.currentThread;

public class ThreadTwo implements Runnable{

    @Override
    public void run() {
        init();
    }

    private void init()
    {
        for(int i=20;i<30;i++)
        {
            if(i==22)
            {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {

                    System.out.println("Thread is interrupted");
                    System.out.println(currentThread().getState());
                }
            }
            System.out.println(i);
        }
    }
}
