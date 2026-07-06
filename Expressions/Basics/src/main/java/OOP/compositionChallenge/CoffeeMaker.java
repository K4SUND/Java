package OOP.compositionChallenge;

public class CoffeeMaker {

    private boolean hasWorkTodo;

    public CoffeeMaker()
    {

    }

    public CoffeeMaker(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void brewCoffee()
    {
        if(hasWorkTodo)
        {
            System.out.println("Coffee Maker done");
            setHasWorkTodo(false);
        }

    }


}
