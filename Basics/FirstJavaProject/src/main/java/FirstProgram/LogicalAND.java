package FirstProgram;

public class LogicalAND {

    public static void main(String[] args) {
        int secondTopScore =  60;
        int topScore =  80;
        if(topScore == 100)
        {
            System.out.println("You got the high score");
        }
        if(topScore != 100)
        {
            System.out.println("not equal to 100");
        }
        if(topScore >100)
        {
            System.out.println("greater than 100");
        }
        if(topScore>= 100)
        {
            System.out.println("Greater than or equal to 100");
        }
        if(topScore <100)
        {
            System.out.println("less than 100");
        }
        if(topScore <=100)
        {
            System.out.println("less than or equal to 100");
        }

//        & -> ampersand
        // single & -> bitwise and
        // double && -> logical and
        if((topScore>secondTopScore) && (topScore <100))
        {
            System.out.println("top score is greater than second top score and less than 100");
        }
    }
}
