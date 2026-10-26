package OOP.compositionChallenge;

public class Refrigerator {

    private boolean hasWorkToDo;

    public Refrigerator() {

    }

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ref done");
            setHasWorkToDo(false);
        }

    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
