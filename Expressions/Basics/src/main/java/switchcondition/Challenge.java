package switchcondition;

public class Challenge {

    public static void main(String[] args) {
//        char character = 'A';
        char character = 'F';
        switch(character)
        {
            case 'A':
                System.out.println("Able");
                break;
                case 'B':
                    System.out.println("Baker");
                    break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                    System.out.println("Dog");
                    break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("not found");

        }


    }

    public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999){
            if((year%4==0 && year%100!=0)||(year%400==0)){
                return true;
            }
        }
        return false;
    }
    public static int  getDaysInMonth(int month, int year){
        if(month<1 || month>12){
            return -1;
        }
        if(year<1 || year>9999){
            return -1;
        }

        return switch(month){
            case 0,1,3,4,5,6,7,8,9,10,11-> 31;
            case 2 ->{
                boolean leapYear = isLeapYear(year);
                if(leapYear){
                    yield  29;
                }else{
                    yield 28;
                }
            }
            default -> -1;


        };


    }
}
