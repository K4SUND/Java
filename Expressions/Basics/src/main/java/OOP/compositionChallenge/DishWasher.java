package OOP.compositionChallenge;

public class DishWasher {

    private boolean hasWorkTodo;

    public DishWasher() {

    }

    public DishWasher(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void doDishes()
    {
        if(hasWorkTodo)
        {
            System.out.println("Dish done");
            setHasWorkTodo(false);
        }

    }

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }
}
