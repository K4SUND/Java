package Unknown.linkedlist.challengeOne;

public record TownRecord(String name, int distanceFromSydney) {

    @Override
    public String toString() {

        // format specifiers
        return String.format("%s (%d)",name,distanceFromSydney);
    }
}


