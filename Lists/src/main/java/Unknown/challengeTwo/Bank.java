package Unknown.challengeTwo;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;


    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }


    //use findBranch in other 4 methods


    // add a new customer
    public boolean addBranch(String branchName)
    {
        if(findBranch(branchName)==null)
        {
            Branch branch = new Branch(branchName);
            branches.add(branch);
            return true;
        }

        return false;

    }

    public boolean addCustomer(String branchName, String  customerName, double initialTransaction)
    {
        // check branch

        Branch branch = findBranch(branchName);
        if(branch==null)
        {
            return false;
        }
        // check customer and add
        return branch.newCustomer(customerName,initialTransaction);

    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction)
    {
        Branch branch = findBranch(branchName);
        if(branch==null)
        {
            return false;
        }
        return branch.addCustomerTransaction(customerName,transaction);

    }

    private Branch findBranch(String branchName)
    {
        for(Branch branch:branches)
        {
            if(branch.getName().equalsIgnoreCase(branchName))
            {
                return branch;
            }
        }

        return null;

    }

    public boolean listCustomers(String branchName,boolean printTransactions)
    {

        Branch branch = findBranch(branchName);
        if(branch == null)
        {
            return false;
        }

        if(printTransactions)
        {
            System.out.println("Customer details for branch "+branch.getName());
            int i = 0;

            for(Customer customer:branch.getCustomers())
            {
                int j = 0;
                System.out.println("Customer: "+customer.getName()+"["+(i+1)+"]");
                i++;
                System.out.println("Transactions");
                for(double transaction: customer.getTransactions())
                {
                    System.out.println("["+(j+1)+"] Amount "+transaction);
                    j++;
                }


            }


        }else {

            System.out.println("Customer details for branch "+branch.getName());
            int i = 0;
            for(Customer customer:branch.getCustomers())
            {
                System.out.println("Customer: "+customer.getName()+"["+(i+1)+"]");
                i++;
            }


        }

        return true;

    }


}

