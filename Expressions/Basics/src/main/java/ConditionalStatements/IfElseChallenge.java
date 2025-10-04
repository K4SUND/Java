package ConditionalStatements;

public class IfElseChallenge {



    // this is the main method ---> method
    public static void main(String[] args) {

        boolean gameOver = true;
        int levelComplete = 5;
        int bonus = 100;
        int score = 800;
        int finalScore = score;


        if (gameOver) {
//            finalScore = finalScore + (levelComplete*bonus);

            int fs = calculateFinalScore(finalScore, levelComplete, bonus);
            finalScore += levelComplete * bonus;
            finalScore += 1000;

            System.out.println("Your final score is " + finalScore);
            System.out.println("Your final score is " + fs);
        }

        //new variables use memory. so try to use exist variables

        score = 10000;
        levelComplete = 8;
        bonus = 200;
        finalScore = score;
        if (gameOver) {
            int fs = calculateFinalScore(finalScore, levelComplete, bonus);
            finalScore += levelComplete * bonus;
            System.out.println("Now your final score is " + finalScore);
            System.out.println("Now your final score is " + fs);
        }

        // this duplication can be make mistakes
        // it can be forgot to change all places
        // ex :
        // finalScore += levelComplete * bonus; finalScore+=1000;





    }

    ///  So we should use methods
    //        method
    private static int calculateFinalScore(int finalScore, int levelComplete, int bonus) {
        finalScore += levelComplete * bonus + 1000;
        return finalScore;

    }



}
