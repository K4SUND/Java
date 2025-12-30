package OOP.Inheritance;

public class Fish extends Animal {

    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        //remove small from parameterd and add manually for easily
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles() {

        System.out.print("muscles moving");
    }

    private void moveBackFin() {
        System.out.print("backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "s5") {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }


    public static void main(String[] args) {
        Fish fish = new Fish("GoldFish",0.5,2,2);
        Main.doAnimalStuff(fish,"s5");
    }
}
