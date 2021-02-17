package com.hawkins;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit,"Worthing");
        addInOrder(placesToVisit,"Brighton");
        addInOrder(placesToVisit,"London");
        addInOrder(placesToVisit,"Manchester");
        addInOrder(placesToVisit,"Goring");

        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("==================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            int comparison = listIterator.next().compareTo(newCity);
            if(comparison == 0){
                // equal do not add
                System.out.println(newCity + " is already included");
                return false;
            } else  if(comparison >0 ){
                // new city should appear before this one
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            } else if(comparison <0){
                // do nothing

            }

        }
        listIterator.add(newCity);
        return true;
    }
}
