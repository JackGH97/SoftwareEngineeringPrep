package com.hawkins.LeetCode;

public class AddTwoNumbers {

    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.val == 0 || l2.val == 0){
            return new ListNode();
        }

        StringBuilder oneV = new StringBuilder();
        while(l1 != null){
            oneV.append(l1.val);
            l1 = l1.next;
        }

        StringBuilder twoV = new StringBuilder();
        while(l2 != null){
            twoV.append(l2.val);
            l2 = l2.next;
        }


        int total = Integer.parseInt(twoV.toString()) + Integer.parseInt(oneV.toString());
        String strNum = "" + total;
        char[] charArray = strNum.toCharArray();
        ListNode l3 = new ListNode(charArray[charArray.length-1] - '0');

        for (int i = charArray.length-2; i > 0 ; i--) {
            l3.next = new ListNode(charArray[i]);
            l3 = l3.next;
        }

        return l3;

    }
}
