package OOP.polymorphism;

public class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(2),"Funny","Happy");
    }

    public void watchComedy()
    {
        System.out.println("Watching Comedy....");
    }
}
