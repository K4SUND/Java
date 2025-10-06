package switchcondition;

public class SwitchCondition {

    public static void main(String[] args) {

        int value = 14;

        /* boolean is  not accept
        boolean isGood = true;

        switch (isGood) {
            case true:
                System.out.println("true");
                break;
            case false:
                System.out.println("false");
                break;
            default:
                System.out.println("default");
                break;
        }



//double also not supported
// if not supported it shows error (compile errors)
        double isGood = 2.56;

        switch (isGood) {
            case 2.45:
                System.out.println("true");
                break;
            case 2.56:
                System.out.println("false");
                break;
            default:
                System.out.println("default");
                break;
         */


        switch (value) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;

            // here check multiple at once (shortcut) (group)
            case 12:
            case 13:
            case 14:
                System.out.println("value is greater than 11 and less than 15");
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }

    }
}


// case , break , default
// without break all conditions work ( but not check the condition )
// first it should be match with the condition. Then it search break keyword.


//different values all together

// valid switch value types
// byte, short, int , char, Byte,Short, Integer, Character
//String
//enum

