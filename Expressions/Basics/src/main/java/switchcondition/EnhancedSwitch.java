package switchcondition;

public class EnhancedSwitch {

    public static void main(String[] args) {

       /*
        int value = 14;
        switch (value) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");


            // here check multiple at once (shortcut) (group)
            case 12, 13, 14 -> System.out.println("value is greater than 11 and less than 15");
            default -> System.out.println("was not 1 or 2");
        }

        */
//        String month   = "APR";
        String month = "OCT";
        System.out.println(getQuarter(month));
    }

    public static String getQuarter(String month) {
        /*
        //1. traditional
        switch (month) {
            case "JAN":
            case "FEB":
            case "MAR":
                return "1st";
            case "APR":
            case "MAY":
            case "JUN":
                return "2nd";
            case "JUL":
            case "AUG":
            case "SEP":
                return "3rd";
            case "OCT":
            case "NOV":
            case "DEC":
                return "4th";
            default:
                return "Bad Input";
        }

         */


        /*
        switch (month) {
            case "JAN", "FEB", "MAR" -> {
                return "1st";
            }
            case "APR", "MAY", "JUN" -> {
                return "2nd";
            }
            case "JUL", "AUG", "SEP" -> {
                return "3rd";
            }
            case "OCT", "NOV", "DEC" -> {
                return "4th";
            }
            default -> {
                return "Bad Input";
            }
        }

         */


        // enhanced
        // return keyword
        //1. use blocks
        /*
        switch (month) {
            case "JAN", "FEB", "MAR" -> {
                return "1st";
            }
            case "APR", "MAY", "JUN" -> {
                return "2nd";
            }
            case "JUL", "AUG", "SEP" -> {
                return "3rd";
            }
            case "OCT", "NOV", "DEC" -> {
                return "4th";
            }
            default -> {
                return "false";
            }
        }

         */
        // enhanced
        // return keyword ( returning a value )
        //2. return keyword at first ( Before the switch keyword )
        // return the whole switch expression. ( inside a method )
        // ---> inside a method
        return switch (month) {
            case "JAN", "FEB", "MAR" -> "1st";
            case "APR", "MAY", "JUN" -> "2nd";
            case "JUL", "AUG", "SEP" -> "3rd";
            case "OCT", "NOV", "DEC" -> "4th";
            // use code block ---> have to use yield
            default -> {
               yield  "false";
            }
        };

    }

}
