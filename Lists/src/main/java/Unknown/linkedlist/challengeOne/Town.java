package Unknown.linkedlist.challengeOne;

public class Town {
    private String name;
    private int distanceFromSydney;

    public Town(String name, int distanceFromSydney) {
        this.name = name;
        this.distanceFromSydney = distanceFromSydney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistanceFromSydney() {
        return distanceFromSydney;
    }

    public void setDistanceFromSydney(int distanceFromSydney) {
        this.distanceFromSydney = distanceFromSydney;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)",name,distanceFromSydney);
    }
}
