package OOP.polymorphism;

public class Adventure extends Movie{

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        //specific to Adventure class
        System.out.printf("..%s%n".repeat(2),"Scene","Music");
    }

    public void watchAdventure()
    {
        System.out.println("Adventure....");
    }
}
