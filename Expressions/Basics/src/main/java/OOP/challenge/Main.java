package OOP.challenge;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        //set bank account
        bankAccount.setAccountNumber(1234567);
        bankAccount.setCustomerName("N.A.K.D.Nissanka");
        bankAccount.setEmail("Kasund48@gmail.com");
        bankAccount.setPhoneNumber(714353263);

        // deposit
        bankAccount.deposit(1000);

        //withdraw (500)
        bankAccount.withdraw(500);
        bankAccount.withdraw(500);
        bankAccount.withdraw(500);

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getPhoneNumber());


    }
}
