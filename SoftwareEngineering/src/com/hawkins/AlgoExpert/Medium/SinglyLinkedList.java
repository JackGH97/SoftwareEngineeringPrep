package com.hawkins.AlgoExpert.Medium;



public class SinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertHead(3);
        list.insertHead(4);
        list.insertLast(2);
        list.deleteFirst();
        list.printLinkedList();
    }

    Node head; // head of list

    /* Linked list Node*/
    class Node {
        int data;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d) {
            data = d;
        }

        public void displayNodeData() {
            System.out.println("Data : " + data);
        }

    }

    public Node deleteFirst() {
        head = head.next;
        return head;
    }

    // Use to delete node after particular node
    public void deleteAfter(Node after) {
        Node temp = head;
        while (temp.next != null && temp.data != after.data) {
            temp = temp.next;
        }
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public void insertHead(int data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
    }

    public void insertLast(int data){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    // For printing Linked List
    public void printLinkedList() {
        System.out.println("Printing LinkedList (head --> last) ");
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }
}



