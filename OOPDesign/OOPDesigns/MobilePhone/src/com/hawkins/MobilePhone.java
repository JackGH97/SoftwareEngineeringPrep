package com.hawkins;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >=0){
            return false;
        }
        return myContacts.add(contact);
    }

    public boolean updateContact(Contact old, Contact updated){
        if(myContacts.contains(old)){
            myContacts.set(myContacts.indexOf(old),updated);
            return myContacts.contains(updated);
        }
        return false;
    }

    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            return myContacts.remove(contact);
        }
        return false;
    }

    private int findContact(Contact contact){
        if(myContacts.contains(contact)){
            return myContacts.indexOf(contact);
        }
        return -1;
    }


    private int findContact(String contactName){
        for(int i=0; i<this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        if(findContact(name) >=0) {
            return myContacts.get(findContact(name));
        }
        return null;
    }

    public void printContacts(){
        System.out.print("Contact List:"+ "\n");
        int i = 1;
        for(Contact c : myContacts){
            System.out.print(i + ". " +c.getName() + " -> " + c.getPhoneNumber() + "\n");
            i++;
        }
    }

}
