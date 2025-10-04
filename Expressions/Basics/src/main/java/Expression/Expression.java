package Expression;


// brown (black screen) - keywords

public class Expression {
    public static void main(String[] args) {
        // keywords are reserved, can't use as variable names (identifiers)
        //int int =5;

        int int2 = 5;

        //full - statement
        //expression - kilometers = (100 * 1.609344)
        //variable name, values, operators
        //include the double keyword and the ; --> it creates the statement
        double kilometers = (100 * 1.609344);

        //expressions :
        //1. highScore = 50, 2. highScore > 25 ,3. highScore = 1000 + highScore
        //3 has actual two expressions --> 1000 + highScore and highScore = 1000 + highScore
        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore;
        }

        // challenge
        int health = 100;
        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }

        //health = 100, health < 25 ,highScore > 1000, highScore - 1000 , highScore = highScore - 1000
        //(health < 25) && (highScore > 1000)  ---> generate a value , include variable names, operators (ex:&&)

    }
}


/*
identifiers
class names, method names, variable names

 special:
 true and false are not keywords. But can't use as identifier
 null also like that

 */