package concurrentThreads;

public enum ThreadColor {


    //1. objects
    ANSI_RESET("\u001B[0m"),
    ANSI_GREEN("\u001B[32m"),
    ANSI_RED("\u001B[31m"),
    ANSI_YELLOW("\u001b[33m");

    //2. variable
    private String color;


    //3. constructor

    ThreadColor(String color) {
        this.color = color;
    }

    //get Method

    public String color() {
        return color;
    }
}
