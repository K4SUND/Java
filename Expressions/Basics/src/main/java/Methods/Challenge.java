package Methods;

public class Challenge {

    //first method
    private static void  displayHighScorePosition(String playerName, int position) {
        System.out.println( playerName + " managed to get into position " + position + " on the high score list");
    }

    //second method
    private static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }

    //reduce return
    private static int calculateHighScorePositionWithOneReturn(int score) {
        int highScorePosition = 4;
        if (score >= 1000) {
            highScorePosition =1 ;
        } else if (score >= 500) {
            highScorePosition =2 ;
        } else if (score >= 100) {
            highScorePosition = 3;
        }
        return highScorePosition;
    }


    public static void main(String[] args) {

//        int score1 = 1500;  //kasun
//        int score2 = 1000; //thimal
//        int score3 = 500;//jeewaka
//        int score4 = 100; //kaveen
//        int score5 = 25; //danusha
        int score1 = 1500;  //kasun
        int score2 = 999; //thimal
        int score3 = 499;//jeewaka
        int score4 = 99; //kaveen
        int score5 = -10; //danusha

        //calculate position and pass
        displayHighScorePosition("kasun",calculateHighScorePosition( score1));
        displayHighScorePosition("kasunWithOneReturn",calculateHighScorePositionWithOneReturn( score1));
        displayHighScorePosition("thimal",calculateHighScorePosition( score2));
        displayHighScorePosition("jeewaka",calculateHighScorePosition( score3));
        displayHighScorePosition("kaveen",calculateHighScorePosition( score4));
        displayHighScorePosition("danusha",calculateHighScorePosition( score5));

    }
}
