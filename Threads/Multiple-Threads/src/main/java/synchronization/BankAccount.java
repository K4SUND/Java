package synchronization;


// multiple threads access this
public class BankAccount {
//    private double balance;

    //step one : make this volatile
//    private volatile double balance;

    //
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public  void deposit(double amount) {
        try {
            // step 3 : show long running processed without in critical section shouldn't be in the synchronized methods
            // this is not critical section
            // therefore this is not be synchronized( all the threads block because of this )

            System.out.println("Meet the CEO");
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //now other threads are not blocked
        // Meet the ceo and other threads works well
        // this part synchronized ( critical section )
        synchronized (this){
            //
            double originalBalance = balance;
            balance += amount;
            System.out.println("DEPOSITED:"+amount+",START:"+originalBalance+",NOW:"+balance);
        }


    }

    public synchronized void withdraw(double amount) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        double originalBalance = balance;
        //
        if(balance - amount >= 0){

            balance -= amount;
            System.out.println("WITHDRAWED:"+amount+",START:"+originalBalance+",NOW:"+balance);
        }else {
            System.out.println("WITHDRAW:"+amount+",START:"+originalBalance+",INSUFFICIENT BALANCE");
        }


    }
}
