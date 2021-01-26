package com.hawkins.LeetCode;

public class DesignLinkedList {



    public class SinglyListNode {
        int val;
        SinglyListNode next;
        SinglyListNode(int x) {
            val = x;
        }
    }

    class MyLinkedList {
        SinglyListNode head;

        /**
         * Initialize your data structure here.
         */
        public MyLinkedList() {
                head = null;
        }

        private SinglyListNode getNode(int index) {
            SinglyListNode cur = head;
            for(int i = 0; i < index; i++){
                cur = cur.next;
            }
            return cur;
        }

        private SinglyListNode getTail() {
            SinglyListNode cur = head;
            while(cur.next != null){
                cur = cur.next;
            }
            return cur;
        }

        /**
         * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
         */
        public int get(int index) {
            SinglyListNode cur = getNode(index);
            return cur == null ? -1 : cur.val;
        }


        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */


        public void addAtHead(int val) {
            SinglyListNode cur = new SinglyListNode(val);
            if(head == null){
                head = cur;
                return;
            }
            cur.next = head;
            head = cur;

        }

        /**
         * Append a node of value val to the last element of the linked list.
         */
        public void addAtTail(int val) {
            if(head == null){
                addAtHead(val);
                return;
            }
            SinglyListNode prev = getTail();
            SinglyListNode cur = new SinglyListNode(val);
            prev.next = cur;
        }

        /**
         * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
         */
        public void addAtIndex(int index, int val) {
            if(index == 0){
                addAtHead(val);
                return;
            }
            SinglyListNode prev = getNode(index-1);
            if(prev == null){
                return;
            }
            SinglyListNode cur = new SinglyListNode(val);
            cur.next = prev.next;
            prev.next = cur;
        }

        /**
         * Delete the index-th node in the linked list, if the index is valid.
         */
        public void deleteAtIndex(int index) {
            SinglyListNode cur = getNode(index);
            if (cur == null) {
                return;
            }
            SinglyListNode prev = getNode(index - 1);
            SinglyListNode next = cur.next;
            if (prev != null) {
                prev.next = next;
            }
            else {
                // modify head when deleting the first node.
                head = next;
            }
        }

    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}
