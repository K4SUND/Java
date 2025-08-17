package FirstProgram;

public class LogicalOR {
    public static void main(String[] args) {
        int topScore = 90;
        int secondTopScore = 99;

        if(topScore > 91 || secondTopScore<100)
        {
            System.out.println("Either one or two is correct");
        }

        if(topScore > 91 || secondTopScore<98)
        {
            System.out.println("all the two is incorrect");
        }
    }
}
