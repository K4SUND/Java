package OOP.polymorphism;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        /*
        Movie movie = new Movie("KKR");
        movie.watchMovie();


        // Adventure is type of Movie
        Movie movie1 = new Adventure("KKR2");
        movie1.watchMovie();

        Movie movie2 = new Comedy("KKR3");
        movie2.watchMovie();


        //create and get instance
        Movie movie3 = Movie.getMovie("Adventure","KKR2");
        movie3.watchMovie();  //same as movie1

         */

        Scanner s = new Scanner(System.in);
        while (true)
        {
            System.out.println("Type: A- Adventure, C- Comedy, Q- Quit");
            String type = s.nextLine();

            if("Qq".contains(type))
            {
                break;
            }

            System.out.println("Title:");
            String title = s.nextLine();

            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();

        }

    }

}
