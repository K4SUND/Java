package OOP.constructor;

import javax.accessibility.AccessibleComponent;

public class Constructor {

    public static void main(String[] args) {
        Account account = new Account();
        Account account2 = new Account(123456678);
        Account account3 = new Account(1234,230,"Kaz","k@gmail.com",714353263);

        Account account4 = new Account("kasun@gmail.com");

//        System.out.println(account.toString());
//        System.out.println(account2.toString());
//        System.out.println(account3.toString());
    }
}
