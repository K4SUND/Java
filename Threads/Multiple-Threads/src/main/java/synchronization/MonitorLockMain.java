package synchronization;

public class MonitorLockMain {

    public static void main(String[] args) {


        BankAccountNew bankAccountNew = new BankAccountNew("Tom",1000);

        // withdraw
        Thread t1 = new Thread(()->{
            bankAccountNew.withdraw(250);
        });

        //deposit
        Thread t2 = new Thread(()->{
            bankAccountNew.deposit(500);
        });

        // update name
        Thread t3 = new Thread(()->{
            bankAccountNew.setName("kasun");
        });

        // again withdraw
        Thread t4 = new Thread(()->{
            bankAccountNew.withdraw(100);
        });


        // again deposit
        Thread t5 = new Thread(()->{
            bankAccountNew.deposit(200);
        });




        /*
        deposit - synchronized
        withdraw - synchronized
        setName - synchronized

        same object
        therefore only one thread can have key for the lock
        at one time.

        so only one method is running at one time


         */


        //withdraw
        t1.start();
        //deposit
        t2.start();
        //sleep main thread
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // update name
        t3.start();
        //again withdraw
        t4.start();

        //again deposit( <500)
        t5.start();



    }
}
