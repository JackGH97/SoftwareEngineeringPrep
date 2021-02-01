package com.hawkins;

import java.util.ArrayList;

public class MobilePhone {

    private int myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(int myNumber,ArrayList<Contact> contacts) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<Contact>();
    }

    public void printContacts(){
        for(int i = 0; i <contacts.size(); i++){
            System.out.println("Name: " + contacts.get(i).getName() + " ,Mobile Number: " + contacts.get(i).getNumber());
        }
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact already on file");
            return  false;
        }
        contacts.add(contact);
        return true;
    }

    private int findContact(Contact contact){
        return this.contacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i = 0; i<this.contacts.size(); i++){
            Contact contact = this.contacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }


    public boolean updateExistingContact(Contact contact, Contact newContact){
        int foundPosition = findContact(contact);
        if(foundPosition <0){
            System.out.println("Contact was not found");
            return false;
        }
        this.contacts.set(foundPosition,newContact);
        System.out.println("Contact Updated");
        return true;

    }

    public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            return  contact.getName();
        }
        return  null;
    }

    public boolean removeExistingContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition <0){
            System.out.println("Contact was not found");
            return false;
        }
        this.contacts.remove(foundPosition);
        System.out.println("Contact was deleted");
        return true;
    }




}
