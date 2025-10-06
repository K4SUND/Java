package OOP;

public class Classes {

    public static void main(String[] args) {
        CarJavaDefault car = new CarJavaDefault();
        CarSetDefault carOne = new CarSetDefault();

        /*
        //not initializing
        //1
        CarSetDefault carTwo;
        carTwo.setModel();  //compile error


        //2
        CarSetDefault carThree = null;
        carThree.setColor("Yellow");   // null exception at run time
         */


        car.describeCar();
        carOne.describeCar();

        //use of getters
//        carOne.color;
        System.out.println(carOne.getColor());
        //set the color (now -- gray , set to  -- black )
        carOne.setColor("black");
        System.out.println(carOne.getColor());

        carOne.setMake("Toyota");
        carOne.setMake(null);
        carOne.setMake("Porsche");
        System.out.println(carOne.getMake());

    }

}
