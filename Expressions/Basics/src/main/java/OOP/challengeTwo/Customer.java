package OOP.challengeTwo;

public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getName() {
        return name;
    }

    //constructors
    public Customer(){
        this("default",0.0,"default");

    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;


        System.out.println("All args constructor called");
    }

    public Customer(String emailAddress, String name) {
        this(name,0.0,emailAddress);

    }
}
