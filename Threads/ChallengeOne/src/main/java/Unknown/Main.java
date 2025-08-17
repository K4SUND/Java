package Unknown;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Thread One (extend Thread class)
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();

        //Thread Two (using runnable interface)
        ThreadTwo threadTwo = new ThreadTwo();
        Thread thread = new Thread(threadTwo);
        thread.start();

        //Third (using lamda)
        Runnable runnable = ()->{
            //run method
            for(int i=90;i<100;i++){
                if(i==99)
                {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(i);
            }
        };

        Thread threadThree = new Thread(runnable);
        threadThree.start();



        //interrupt the first and second threads
        threadOne.interrupt();
        thread.interrupt();



    }
}