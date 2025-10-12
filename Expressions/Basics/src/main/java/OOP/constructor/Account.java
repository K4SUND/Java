package OOP.constructor;

public class Account {

    private long accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;

    private long phoneNumber;


    public Account(){
        System.out.println("default constructor called");
    }

    //constructor channing describe
    public Account(String email){

        this(23456);
//        System.out.println("channing");
    }
    public Account(long accountNumber){
        this.accountNumber = accountNumber;
        System.out.println("account number constructor called");
    }

    public Account(long accountNumber, double accountBalance, String customerName, String email, long phoneNumber){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("All args constructor called");
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}


// when no any constructor declared , there is a noargs constructor by default (default constructor)
// but when we define any constructor, compiler is not give the default constructor anymore -  so we have to declare it too

// constructor -  intialize the object