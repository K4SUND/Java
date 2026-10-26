package Unknown.challengeOne;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Kasun");
        customer.getTransactions().add(2.00);
        customer.getTransactions().add(3.0);
        customer.getTransactions().add(4.00);
        customer.getTransactions().add(2.00);

        Customer customerOne = new Customer("Thimal");
        customerOne.getTransactions().add(3.00);
        customerOne.getTransactions().add(7.0);
        customerOne.getTransactions().add(-3.00);
        customerOne.getTransactions().add(6.00);


        Bank bank = new Bank("Peoples");
        bank.addCustomer(customer);
        bank.addCustomer(customerOne);
        bank.addCustomer(customerOne); // except --exist

        bank.addTransaction("Kasun",10.00);

        bank.printStatement("Kasun");
        bank.printStatement("Thimal");



    }


}
