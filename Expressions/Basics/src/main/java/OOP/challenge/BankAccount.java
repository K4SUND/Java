package OOP.challenge;

public class BankAccount {


    private long accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;

    private long phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void deposit(double amount){
        this.accountBalance += amount;
        System.out.println("deposited: "+amount+", And new balance is "+this.accountBalance);
    }
    public void withdraw(double amount){
        if(accountBalance - amount <0){
            System.out.println("Insufficient funds!");
            return;
        }
        this.accountBalance -= amount;
        System.out.println("withdrawed: "+amount+", And new balance is "+this.accountBalance);
    }
}
