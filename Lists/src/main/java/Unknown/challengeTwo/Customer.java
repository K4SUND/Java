package Unknown.challengeTwo;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {

        this.name = name;

        // initialize transaction list and add initial transaction
        transactions = new ArrayList<>();
        transactions.add(initialTransaction);
    }

    // transaction --
    // credit -- (-)
    // debit -- (+)


    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction)
    {
        transactions.add(transaction);

    }
}
