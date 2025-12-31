package synchronization;

public class BankAccountNew {

    private double balance;
    private  String name;


    // here it created lock objects for managing locking for fields
    // it not lock whole object then
    // each lock is relavant to each field

    private final Object balanceLock = new Object();  // lock the balance
    private final Object nameLock = new Object();  // lock the name







    public BankAccountNew(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    // 1 method - synchronized in method signature
//    public synchronized void setName(String name) {
//        this.name = name;
//        System.out.println("Updated:" + this.name);
//    }

    // 2 method - synchronized block
    // advantage - didn't block all - only critical section

//    public  void setName(String name) {
//
//        synchronized (this){
//            this.name = name;
//        }
//
//        System.out.println("Updated:" + this.name);
//    }


    // 3 method - lock using specific object instead of whole
//    public  void setName(String name) {
//
//        synchronized (this.name){
//            this.name = name;
//        }
//
//        System.out.println("Updated:" + this.name);
//    }


    // 4 method - lock object
    public void setName(String name) {

        synchronized (nameLock) {
            this.name = name;
        }

        System.out.println("Updated:" + this.name);
    }

    public double getBalance() {
        return balance;
    }

    /*

    old deposit method


    public synchronized void deposit(double amount) {


        try {
            // step 3 : show long running processed without in critical section shouldn't be in the synchronized methods
            // this is not critical section
            // therefore this is not be synchronized( all the threads block because of this )

            System.out.println("Meet the CEO");
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        double originalBalance = balance;
        balance += amount;
        System.out.println("DEPOSITED:" + amount + ",START:" + originalBalance + ",NOW:" + balance);



    }

     */


    // reentrant synchronization
    // same thread has the lock -> nested synchronized methods are calling without blocking

    // new deposit method with bonus
    public synchronized void deposit(double amount) {


        try {
            // step 3 : show long running processed without in critical section shouldn't be in the synchronized methods
            // this is not critical section
            // therefore this is not be synchronized( all the threads block because of this )

            System.out.println("Meet the CEO");
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        giveBonus(amount);

    }

    public synchronized void withdraw(double amount) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        double originalBalance = balance;
        //
        if (balance - amount >= 0) {

            balance -= amount;
            System.out.println("WITHDRAWED:" + amount + ",START:" + originalBalance + ",NOW:" + balance);
        } else {
            System.out.println("WITHDRAW:" + amount + ",START:" + originalBalance + ",INSUFFICIENT BALANCE");
        }


    }



    // create a method that give bonus when deposit over 500

    // this access to balance
    // update the balance
    // this should be inside in deposit method
    private void giveBonus(double amount){
        if(amount>=500)
        {

            synchronized (balanceLock)
            {
                double originalBalance = this.balance;
                this.balance += (amount+50);
                System.out.println("Congratulations, you earned 50 rs as bonus");
                System.out.println("DEPOSITED:" + amount + ",START:" + originalBalance + ",NOW:" + this.balance);
            }
        }else {
            synchronized (balanceLock)
            {
                double originalBalance = this.balance;
                this.balance += amount;
                System.out.println("DEPOSITED:" + amount + ",START:" + originalBalance + ",NOW:" + this.balance);
            }
        }
    }
}
