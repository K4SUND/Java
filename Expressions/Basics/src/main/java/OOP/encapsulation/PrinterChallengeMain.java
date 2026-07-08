package OOP.encapsulation;

public class PrinterChallengeMain {

    public static void main(String[] args) {

//        PrinterChallenge printer = new PrinterChallenge(50,true);
        PrinterChallenge printer = new PrinterChallenge(50,false);
        System.out.println(
                "initial page count:" +printer.getPagesPrinted()
        );

        //3
        double printPages = printer.printPages(5);
        System.out.println("Sheets:"+printPages);
        System.out.println(
                "page count:" +printer.getPagesPrinted()
        );

        System.out.println("Sheets:"+printer.printPages(5));
        System.out.println(
                "page count:" +printer.getPagesPrinted()
        );

    }

}
