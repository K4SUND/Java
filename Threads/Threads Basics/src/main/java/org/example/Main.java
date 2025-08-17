package org.example;

import java.util.concurrent.TimeUnit;

//main thread
//
// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //main thread
        var currentThread = Thread.currentThread();
        System.out.println(currentThread.getClass().getName()); //java.lang.Thread

        System.out.println(currentThread);
        printThreadState(currentThread); // thread class toString method
        //Thread[main,5,main]


        currentThread.setName("Main guy");
        currentThread.setPriority(Thread.MAX_PRIORITY);  // priority 1-10
        System.out.println(currentThread);

        //custom thread
        CustomThread customThread = new CustomThread();
        customThread.start();

        //run instead of start
//        customThread.run();
        //here it is not concurrent working. Synchronize




        //before main thread tasks
        Runnable myRunnable = () -> {

            for(int i = 0; i < 5; i++){
                System.out.println("2");
                try{
                    Thread.sleep(250);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };


        //pass the runnable variable to the thread constructor
        Thread myNewThread = new Thread(myRunnable);
        myNewThread.start();




        //main thread

        //test the concurrency of the main + custom thread
        //another for loop in the main thread
        for (int i = 0; i < 5; i++) {
            System.out.println("0");
            try {
                TimeUnit.SECONDS.sleep(1);
//                Thread.sleep(500);
            } catch (InterruptedException e) {

                e.printStackTrace();

            }
        }


        //create another thread here
        //runnable lambda expression
        /*

        here it mean that it goes to run method of Runnable interface
        Runnable myRunnable = ()->{

        };

         */



    }


    public static void printThreadState(Thread thread) {
        System.out.println("--------");
        System.out.println("Thread Id: " + thread.getId());
        System.out.println("Thread Name: " + thread.getName());
        System.out.println("Thread Priority: " + thread.getPriority());
        System.out.println("Thread State:" + thread.getState());
        System.out.println("Thread Group:" + thread.getThreadGroup());
        System.out.println("Thread is alive : " + thread.isAlive());
        System.out.println("--------");
    }
}

/*
--------
Thread Id: 1
Thread Name: main
Thread Priority: 5
Thread State:RUNNABLE
Thread Group:java.lang.ThreadGroup[name=main,maxpri=10]
Thread is alive : true
--------
 */