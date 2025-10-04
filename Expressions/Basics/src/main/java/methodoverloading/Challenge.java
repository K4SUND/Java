package methodoverloading;

public class Challenge {


    public static void main(String[] args) {

        System.out.println(convertToCentimeters(1));
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(1,0));
        System.out.println(convertToCentimeters(5,8));

    }

    public static double convertToCentimeters(int entireHeightInInches){

        return entireHeightInInches*2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int remainInInches){

//        return ((heightInFeet*12)+remainInInches)*2.54;
        // here we can call the first method

        //1. calculate inches
        // (heightInFeet*12)+remainInInches

        return convertToCentimeters(heightInFeet*12+remainInInches);

    }
}
