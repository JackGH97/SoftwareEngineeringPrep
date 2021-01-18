package com.hawkins.AlgoExpert.Medium;

import java.util.LinkedList;

public class RemoveKthNode {


    // O(N) Time || O(1) Space
    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        // Write your code here.
        int count = 1;
        LinkedList first = head;
        LinkedList second = head;
        while(count <= k){
            first = first.next;
            count++;
        }
        // edge case
        // if the head is meant to be removed then change its value to the next.
        if(first == null){
            head.value = head.next.value;
            head.next = head.next.next;
            return;
        }
        while(first.next != null){
            first = first.next;
            second = second.next;
        }
        // references the same object in memory doesnt it!
        second.next = second.next.next;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
