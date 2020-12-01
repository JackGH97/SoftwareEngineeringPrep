package com.hawkins;
public class LinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertHead(3);
        list.insertHead(4);
        list.insertLast(2);
        list.deleteFirst();
        list.printLinkedList();
        list.insertHead(10);
        list.printLinkedList();
    }

    Node head;

    public class Node{

        Node next;
        int data;

        public Node(int data){
            this.data = data;
        }

        public void displayNodeData(){
            System.out.println("Node Value: " + data);
        }
    }

    public Node deleteFirst() {
        head = head.next;
        return head;
    }

    // Use to delete node after particular node
    public void deleteAfter(Node after) {
        Node temp = head;
        while(temp.next != null && temp.data != after.data){

        }
        if (temp.next != null){
            temp.next = temp.next.next;
        }

    }

    public void insertHead(int data) {
        if(this.head == null){
            head = new Node(data);
            head.next = null;
        }
        else{
            Node temp = head;
            head = new Node(data);
            head.next = temp;
        }
    }

    public void insertLast(int data){
        Node temp = head;
        while(temp.next != null) {
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
