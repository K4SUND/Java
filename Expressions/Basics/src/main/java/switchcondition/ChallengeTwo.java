package switchcondition;

public class ChallengeTwo {

    public static void main(String[] args) {
        printDayOfWeek(1);
        System.out.println("++++++++");
        printDayOfWeek(0);
    }

    public static void printDayOfWeek(int day) {
        System.out.println("day is " + day);


        // traditional switch use as an expression
        // Yield returns from the switch expression.
        String example = switch (day) {
            case 1:
                yield "Hello";
            default:
                yield "Default";

        };


        System.out.println(example);


        // here it doesn't use return no
        // here it is a expression
        // don't return through a method  ( only assign to a variable )

        String dayOftheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };

        System.out.println("dayOftheWeek is " + dayOftheWeek);

    }

    public static void printWeekDay(int day) {
        System.out.println("day is " + day);

        String dayOftheWeek ;

        if (day == 0) {
            dayOftheWeek = "Sunday";
        } else if (day == 1) {
            dayOftheWeek = "Monday";
        } else if (day == 2) {
            dayOftheWeek =  "Tuesday";
        } else if (day == 3) {
            dayOftheWeek =  "Wednesday";
        } else if (day == 4) {
            dayOftheWeek =  "Thursday";
        } else if (day == 5) {
            dayOftheWeek =  "Friday";
        } else if (day == 6) {
            dayOftheWeek =  "Saturday";
        } else {
            dayOftheWeek =  "Invalid day";
        };

        System.out.println("dayOftheWeek is "+dayOftheWeek);
    }




}
