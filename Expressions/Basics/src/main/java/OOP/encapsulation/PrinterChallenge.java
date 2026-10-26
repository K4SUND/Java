package OOP.encapsulation;

public class PrinterChallenge {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public PrinterChallenge(int tonerLevel, boolean duplex) {

        this(tonerLevel, 0, duplex);
    }

    public PrinterChallenge(int tonerLevel, int pagesPrinted, boolean duplex) {
       // ternary operator
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        int tonerLevelNew = tonerLevel;
        tonerLevelNew += tonerAmount;
        if (tonerLevelNew > 100 || tonerLevelNew < 0) {
            return -1;
        }

        tonerLevel = tonerLevelNew;
        return tonerLevel;
    }

    public double printPages(int pages) {
        double sheets = 0;
        if (duplex) {
            sheets = Math.ceil((double) pages / 2);
            System.out.println("Duplex Printer");
        }else{
            sheets = pages;
        }

        pagesPrinted += pages;
        return sheets;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
