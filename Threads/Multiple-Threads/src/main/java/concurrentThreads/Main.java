package concurrentThreads;

import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StopWatch stopWatch  = new StopWatch(TimeUnit.SECONDS);

        // thread created by giving name also
        Thread green = new Thread(stopWatch::countDown,ThreadColor.ANSI_GREEN.name());
        Thread yellow = new Thread(()->stopWatch.countDown(7),ThreadColor.ANSI_YELLOW.name());
        Thread red = new Thread(stopWatch::countDown,ThreadColor.ANSI_RED.name());
        green.start(); // starts with 5
        yellow.start(); //starts with 7
        red.start();  // starts with 5

    }
}