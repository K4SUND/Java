package Unknown.challengeTwo;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }



    // add customer
    public boolean newCustomer(String customerName, double initialTransaction)
    {
        if(findCustomer(customerName)==null)
        {
            Customer customer = new Customer(customerName,initialTransaction);
            customers.add(customer);
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction)
    {
        Customer customer = findCustomer(customerName);
        if(customer!=null)
        {
            customer.addTransaction(transaction);
            return true;
        }

        return false;
    }

    // use this in others (except two getters)
    private Customer findCustomer(String customerName)
    {
        for(Customer current:customers){
            if(current.getName().equalsIgnoreCase(customerName)){
                return current;
            }
        }

        return null;

    }

}
