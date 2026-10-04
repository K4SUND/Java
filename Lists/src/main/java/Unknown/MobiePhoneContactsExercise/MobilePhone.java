package Unknown.MobiePhoneContactsExercise;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {

        if (findContact(contact.getName()) != -1) {
            return false;
        }

        myContacts.add(contact);
        return true;


    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        if (findContact(oldContact) != -1) {
            int position = findContact(oldContact.getName());
            myContacts.set(position, newContact);
            return true;
        }

        //doesn't exist
        return false;


    }

    public boolean removeContact(Contact contact) {

        if (findContact(contact) != -1) {
            myContacts.remove(contact);
            return true;
        }

        //doesn't exist
        return false;
    }


    // check it exists
    private int findContact(Contact contact) {

        return myContacts.indexOf(contact);

    }

    private int findContact(String contactName) {

        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(contactName)) {
                return i;
            }
        }

        return -1;

    }

    public Contact queryContact(String contactName) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(contactName)) {
                return contact;
            }
        }

        return null;
    }

    public void printContacts() {
        int i = 0;
        System.out.println("Contact List:");
        for (Contact contact : myContacts) {
            System.out.println((i+1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
            i++;

        }
    }


}