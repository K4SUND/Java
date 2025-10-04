package methodoverloading;

public class ChallengeTwo {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(0,3945));
        System.out.println(getDurationString(0,58));
    }

    public static String getDurationString(int seconds) {

        if (seconds >= 0) {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);

        }
        return "seconds should be greater than 0";
    }

    public static String getDurationString(int minutes, int seconds) {

        // here the importance of the validation is
        //-- we don't again convert seconds in to minutes
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            minutes = minutes % 60;
            return hours + "h " + minutes + "m " + seconds + "s";
        }
        return "minutes shoud be greater than 0 and seconds should be greater than 0 and less than 59";
    }
}
