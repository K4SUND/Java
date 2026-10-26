package OOP.polymorphism;

public class NexMain {

    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovie();


        // parent class <---- child
        // otherwise cast


        /*

        // runtime error
        // wrong cast
        // Adventure <----- Comedy
        Adventure a = (Adventure) Movie.getMovie("C","Jaws");
        a.watchMovie();

         */
        Comedy jaws = (Comedy) Movie.getMovie("C","Jaws");
        jaws.watchMovie();

        Object comedyM = Movie.getMovie("C","Com");
        // Object class doesn't have the methods
        // we have to cast ( to specific type )
        // comedy class have watchComedy()
        Comedy comedyM2 = (Comedy) comedyM;
        comedyM2.watchComedy();



        // var
        // return Movie
        var comedyM3 = Movie.getMovie("C","Comedy2");
        // not having watch comedy
//        comedyM3.watchComedy();
        // have to cast
        Comedy comedyM4 = (Comedy) comedyM3;
        comedyM4.watchComedy();


        // get runtime types

    }
}
