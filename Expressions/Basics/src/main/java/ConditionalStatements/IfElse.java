package ConditionalStatements;

public class IfElse {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;

        if (gameOver) System.out.println("Game Over");
        System.out.println("Score: " + score);


        if (!gameOver)
            System.out.println("Congratulations");
        System.out.println("Your Score is " + score);

        if(score<5000){
            System.out.println("Less than 5000");
        }else {
            System.out.println("Nooo");
        }



        //if- else-if-  else
        //else is the last
        //no limit
        //if top success others are dnt' consider

        int levelComplete = 15;

        if(levelComplete>5 && levelComplete<10)
        {
            System.out.println("greater than 5 and less than 10");
        } else if (levelComplete > 6) {
            System.out.println("greater than 6"); // not efficient  // but when >10 it hits here first

        } else if (levelComplete > 3) {
            System.out.println("greater than 3 but less than or equal 5");
        } else {
            System.out.println("less than or equal 3");
        }

    }


}
