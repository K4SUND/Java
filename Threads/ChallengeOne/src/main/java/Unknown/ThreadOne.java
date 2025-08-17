package Unknown;

public class ThreadOne extends Thread{

    @Override
    public void run() {
        init();
    }

    private void init(){
        for(int i=0;i<10;i++){
            if(i==5){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread is interrupted");
                    System.out.println(currentThread().getState());
                }
            }
            System.out.println(i);
        }
    }
}
