package ConditionalStatements;

public class IfElseChallegeMC {

    private static void calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += levelComplete * bonus;
            finalScore += 1000;
            System.out.println("Final Score: " + finalScore);
        }

    }

    private static int returnCalculateScore(boolean gameOver, int score, int levelComplete, int bonus ) {
        int finalScore = score;
        if (gameOver) {
            finalScore += levelComplete * bonus;
            finalScore += 1000;

        }
        return finalScore;
    }

    public static void main(String[] args) {
//        calculateScore(true,800,5,100);
//        calculateScore(true,10000,8,200);
        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;
        calculateScore(gameOver, score, levelComplete, bonus);
        int highScore = returnCalculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("High Score: " + highScore);

        score = 10000;
        levelComplete = 8;
        bonus = 200;
        calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("High Score: " +
                returnCalculateScore(gameOver, score, levelComplete, bonus));


    }
}
