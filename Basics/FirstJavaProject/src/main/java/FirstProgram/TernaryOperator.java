package FirstProgram;

public class TernaryOperator {
    public static void main(String[] args) {
        String makeOfCar = "Mazda";

//        boolean isDomestic = (makeOfCar=="Mazda")?(true):(false);
        boolean isDomestic = (makeOfCar == "Mazda");
        String model = (isDomestic)?("IsDomestic is true"):("IsDomestic is false");

        if(isDomestic)
        {
            System.out.println("isDomestic is true");
            System.out.println(model);
        }
    }

}
