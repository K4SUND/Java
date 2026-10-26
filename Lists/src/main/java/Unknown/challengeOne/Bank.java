package Unknown.challengeOne;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers;


    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    // add a new customer
    public void addCustomer(Customer customer)
    {
        // check
        for(Customer current :customers)
        {
            //check name
            if(current.getName().equalsIgnoreCase(customer.getName()))
            {
                System.out.println("Already exist");
                return;
            }
        }

        customers.add(customer);
        System.out.println("Customer Added ("+customer.getName()+")");
    }

    public void addTransaction(String customerName, double transaction)
    {
        for(Customer current:customers)
        {
            if(current.getName().equalsIgnoreCase(customerName))
            {
                //get transaction and add
                current.getTransactions().add(transaction);
                return;
            }

        }
    }

    public void printStatement(String customerName)
    {
        for(Customer current:customers)
        {
            if(current.getName().equalsIgnoreCase(customerName))
            {
                //get transaction and add
                System.out.println("-".repeat(30));
                System.out.println("Customer:"+current.getName());
                System.out.println(current.getTransactions());
                for(double transaction: current.getTransactions())
                {
                    System.out.printf("$%10.2f  (%s)%n",transaction,transaction<0?"credit":"debit");
                }
                return;
            }

        }

    }


}

