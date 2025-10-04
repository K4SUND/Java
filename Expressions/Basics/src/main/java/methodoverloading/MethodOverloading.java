package methodoverloading;

public class MethodOverloading {


    public static void main(String[] args) {
        int newScore = calculateScore("Kasun", 100);
        System.out.println("New score: " + newScore);
        //second method ( overload )
        System.out.println("New score: " + calculateScore(100));
        System.out.println("New score: " + calculateScore());


        // test default values
        printValue("Maths",50);
        printValue("Science");
    }

    //can't add default value as String playerName = "default value"
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player Name:" + playerName);
        System.out.println("Player Score:" + score);

        return score + 200;
    }


    //2nd
    public static int calculateScore(int score) {
        System.out.println("Player Name: - ");
        System.out.println("Player Score:" + score);

        return score + 200;
    }

    //3rd
    public static int calculateScore() {
        System.out.println("Player Name: - ");
        System.out.println("Player Score: - ");

        return 0;
    }


    /*
    return type is not matter
    public static void calculateScore() {
        System.out.println("Player Name: - ");
        System.out.println("Player Score: - ");
    }

     */


    // this overloaded methods can be used to give default values
    public static void printValue(String subject, int score){
        System.out.println("Subject : " + subject);
        System.out.println("Score : " + score);
    }

    public static void printValue(String subject){
       // call to the first one
        printValue(subject, 5);
    }





}


//to identify - method name, parameters order, parameters number, parameter types   --- METHOD SIGNATURE
//no matter   - return type, parameter names