package com.hawkins.LeetCode;

public class MergeTwoLists {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);


        ListNode test = mergeTwoLists(l1,l2);

        while(test != null){
            System.out.println(test.val);
            test = test.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null) {
            return null;
        }

        if(l1==null) {
            return l2;
        }

        if(l2==null) {
            return l1;
        }

        ListNode head = null;

        ListNode mergedList = null;


        while(l1 != null && l2 !=null) {
            if(l1.val < l2.val) {
                if(mergedList==null)  {
                    mergedList = l1;
                    head = mergedList;
                } else {

                    mergedList.next = l1;
                    mergedList = mergedList.next;

                }
                l1 = l1.next;
            } else {
                if(mergedList == null) {
                    mergedList=l2;
                    head = mergedList;
                } else {
                    mergedList.next = l2;
                    mergedList = mergedList.next;
                }

                l2 = l2.next;
            }

        }

        if(l1 != null) {
            mergedList.next = l1;
        }

        if(l2 != null) {
            mergedList.next = l2;
        }

        return head;
    }
}
