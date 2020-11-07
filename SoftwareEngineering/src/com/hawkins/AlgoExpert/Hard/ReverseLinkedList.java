package com.hawkins.AlgoExpert.Hard;

public class ReverseLinkedList {

    // O(n) time || O(1) space
    public static LinkedList reverseLinkedList(LinkedList head) {
        LinkedList prev = null;
        while(head != null){
            LinkedList next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }


}
