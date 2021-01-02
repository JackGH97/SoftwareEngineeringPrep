package com.hawkins.Hackerrank;

public class ReverseDoublyLinkedList {

    static class DoublyLinkedListNode {
        int data;
        DoublyLinkedListNode next;
        DoublyLinkedListNode prev;
    }

    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode temp = head;
        DoublyLinkedListNode newHead = head;
        while(temp != null){
            DoublyLinkedListNode prev = temp.prev;
            temp.prev = temp.next;
            temp.next = prev;
            newHead= temp;
            temp = temp.prev;
        }

        return newHead;
    }
}
