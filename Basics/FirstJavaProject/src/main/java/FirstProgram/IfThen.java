package FirstProgram;

public class IfThen {
    public static void main(String[] args) {
        boolean isAlien = false;

        if (isAlien == false) ;
        System.out.println("It is not an alien");

        if (isAlien == true)
            System.out.println("It is not an alien");


        // two lines -> only the immediate following is depend on if else statement
        if (isAlien == true)
            System.out.println("It is not an alien");  //only this depend on the if condition
            System.out.println("I'm scared of aliens"); //not part of if then statement


        // two lines -> only the immediate following is depend on if else statement
        if (isAlien == false){

            System.out.println("It is not an alien");  //only this depend on the if condition
            System.out.println("I'm scared of aliens"); //not part of if then statement

        }



    }
}
