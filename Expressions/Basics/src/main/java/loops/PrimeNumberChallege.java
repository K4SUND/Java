package loops;

public class PrimeNumberChallege {

    public static void main(String[] args) {

//        int number = 2;
        System.out.println("1" + (isPrime(1) ? " is Prime Number" : " is NOT Prime Number"));
        System.out.println("2" + (isPrime(2) ? " is Prime Number" : " is NOT Prime Number"));
        System.out.println("3" + (isPrime(3) ? " is Prime Number" : " is NOT Prime Number"));
        System.out.println("4" + (isPrime(4) ? " is Prime Number" : " is NOT Prime Number"));
        System.out.println("5" + (isPrime(5) ? " is Prime Number" : " is NOT Prime Number"));
        System.out.println("6" + (isPrime(6) ? " is Prime Number" : " is NOT Prime Number"));
        System.out.println("7" + (isPrime(7) ? " is Prime Number" : " is NOT Prime Number"));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        int primeNumberCounter = 0;

        /*
        for (int i = 23; i <= 1000; i += 30) {
            if(primeNumberCounter == 3){
                break;
            }
            if (isPrime(i)) {
                System.out.println(i);
                primeNumberCounter++;
            }

        }


         */
        for (int i = 23; i <= 1000 && primeNumberCounter <3 ; i += 30) {

            if (isPrime(i)) {
                System.out.println(i);
                primeNumberCounter++;
            }

        }


    }


    public static boolean isPrime(int number) {

        if (number <= 2) {
            if (number == 2) {
                return true;
            }
            return false;
        }

//        for (int i = 2; i < number; i++) {
//            //remainder operator
//            // modulo operator
//            if (number % i == 0) {
//                return false;
//            }
//        }


        //ex : 10 is not divisible by 6,7,8,9 -- so don't waste
        for (int i = 2; i < number / 2; i++) {
            //remainder operator
            // modulo operator
            if (number % i == 0) {
                return false;
            }
        }


        return true;
    }
}
