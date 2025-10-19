package advancedConcurrency;

import concurrentThreads.StopWatch;
import concurrentThreads.ThreadColor;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // create instances to each threads

        StopWatch greenStopWatch  = new StopWatch(TimeUnit.SECONDS);
        StopWatch yellowStopWatch  = new StopWatch(TimeUnit.SECONDS);
        StopWatch redStopWatch  = new StopWatch(TimeUnit.SECONDS);

        // thread created by giving name also
        Thread green = new Thread(greenStopWatch::countDown, ThreadColor.ANSI_GREEN.name());
        Thread yellow = new Thread(()->yellowStopWatch.countDown(7), concurrentThreads.ThreadColor.ANSI_YELLOW.name());
        Thread red = new Thread(redStopWatch::countDown, concurrentThreads.ThreadColor.ANSI_RED.name());
        green.start(); // starts with 5
        yellow.start(); //starts with 7
        red.start();  // starts with 5

    }
}
