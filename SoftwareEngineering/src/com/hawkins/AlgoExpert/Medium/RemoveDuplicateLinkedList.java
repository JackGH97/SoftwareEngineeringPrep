package com.hawkins.AlgoExpert.Medium;

import java.util.LinkedList;

public class RemoveDuplicateLinkedList {

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {

        LinkedList currentNode = linkedList;
        while(currentNode != null){
            LinkedList next =  currentNode.next;
            while(next != null && next.value == currentNode.value){
                next = next.next;
            }
            currentNode.next = next;
            currentNode = next;
        }
        return linkedList;
    }
}
