package OOP.polymorphism;

public class RunTImeType {

    public static void main(String[] args) {

        Object unknown = Movie.getMovie("A","TitleOfMovie");



        System.out.println(unknown.getClass().getSimpleName()); //Comedy, Adventure, Movie


        // == compare object references
        // .equals() --> compares string values

        if(unknown.getClass().getSimpleName().equals("Adventure") ){
            Adventure adventure = (Adventure) unknown;
            adventure.watchAdventure();
        } else if (unknown instanceof Comedy) {
            Comedy comedy = (Comedy) unknown;
            comedy.watchComedy();
        }

        //
        if(unknown instanceof Adventure a1)
        {
            //without casting
            a1.watchAdventure();
        }
    }
}
