package loops;

public class ForStatement {

    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }

        System.out.println(calculateInterest(10000,3));
        System.out.println(calculateInterest(10000,4));
        System.out.println(calculateInterest(10000,5));

        for(double i=3.0;i<=5.0;i++){
            System.out.println(i+":"+calculateInterest(10000,i));
        }

        for(double i=7.5;i<=10.0;i+=0.25){

            //stop the full for loop
            if(i>=9.12){
                break;
            }
            System.out.println(i+":"+calculateInterest(10000,i));

        }
    }


    public static double calculateInterest(double amount, double interestRate) {
        return amount * interestRate / 100;
    }


}
