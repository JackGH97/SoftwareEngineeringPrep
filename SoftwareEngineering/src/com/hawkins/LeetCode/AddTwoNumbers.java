package com.hawkins.LeetCode;

public class AddTwoNumbers {


    public static void main(String[] args) {
        System.out.println(10/10);
    }
    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;
        ListNode a = l1;
        ListNode b = l2;
        int carry = 0;
        while(a != null || b != null || carry != 0) {
            int sum = carry;
            sum += a != null ? a.val : 0;
            sum += b != null ? b.val : 0;
            carry = sum / 10;
            if (head == null) {
                head = new ListNode(sum % 10);
                current = head;
            } else {
                current.next = new ListNode(sum % 10);
                current = current.next;
            }
            a = a != null? a.next: null;
            b = b != null? b.next: null;
        }
        return head;

    }
}
