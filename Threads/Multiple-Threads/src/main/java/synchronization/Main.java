package synchronization;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(10000);

        //
        Thread threadOne = new Thread(()->{
            bankAccount.withdraw(2500);
        });

        Thread threadTwo = new Thread(()->{
            bankAccount.deposit(5000);
        });

        Thread threadThree = new Thread(()->{
            bankAccount.withdraw(2500);
        });


        //no guatantee which thread starts first
        threadOne.start();
        threadTwo.start();
        threadThree.start();

        // after these three works prints the final amount
        // use join
        //main thread pause until these done
        try{
            threadOne.join();
            threadTwo.join();
            threadThree.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("AMOUNT:"+bankAccount.getBalance());

    }
}

/*
WITHDRAWED:2500.0,START:15000.0,NOW:12500.0
WITHDRAWED:2500.0,START:10000.0,NOW:12500.0
DEPOSITED:5000.0,START:10000.0,NOW:12500.0
AMOUNT:12500.0

1. order is different --- that's okay
2. but look -- the math is wrong  -- that's not okay


Steps:
 make the sharable variable volatile---- get from and write to main memory instead of thread cache
 : one thread is adding, one thread is substracting
 : non of these are atomic ( compound of processes : so the interleave may cause )

*****
Step :
::: make methods synchronized
- use synchronized key word
- method is locked for one thread
- it has to be finished
-- then unlocked to other threads

-- order change but math is correct


 */