package Unknown.enumLearn;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // create variable using enum
        DaysOfTheWeek monday = DaysOfTheWeek.MONDAY;
        System.out.println(monday);

        // methods
        System.out.println(monday.name());
        System.out.println(monday.ordinal());

        //
        DaysOfTheWeek day = getRandomDay();
        System.out.println(day);
        System.out.println(day.name());
        System.out.println(day.ordinal());


        /*
        for(int i=0;i<7;i++)
        {
            DaysOfTheWeek dayNew = getRandomDay();
//            if(dayNew == DaysOfTheWeek.FRIDAY)
//            {
//                System.out.println("Fri is found");
//            }

            switchDay(dayNew);
        }

         */

        for(Topping topping: Topping.values())
        {
            System.out.println(topping.name()+":"+topping.getPrice());
        }
    }

    // return enum
    public static DaysOfTheWeek getRandomDay()
    {
        // between 0 and 6
        int randomInteger = new Random().nextInt(7);

        // create an array and retrieve
        var days = DaysOfTheWeek.values();
        return days[randomInteger];
    }

    public static void switchDay(DaysOfTheWeek day)
    {
        int dayNum = day.ordinal()+1;
        switch (day)
        {
            case SATURDAY -> System.out.println("Saturday ("+dayNum+")");
            case SUNDAY -> System.out.println("Sunday ("+dayNum+")");
            default -> System.out.println(day.name().charAt(0)+day.name().substring(1,3).toLowerCase()+"("+dayNum+")");
        }
    }
}
