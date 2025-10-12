package OOP.challengeTwo;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Customer customerOne = new Customer("k@gmal.com","kasun");
        Customer customerTwo = new Customer("Kaz",10000,"kaz@gmail.com");

        System.out.println(customer.getName()); //default
        System.out.println(customerOne.getName());  //kasun
        System.out.println(customerTwo.getName());  //kaz

    }
}
