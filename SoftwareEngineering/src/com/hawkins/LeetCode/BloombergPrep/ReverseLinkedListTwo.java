package com.hawkins.LeetCode.BloombergPrep;

public class ReverseLinkedListTwo {


     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


    public ListNode reverseBetween(ListNode head, int m, int n){
        ListNode Temp = head;
        int i = 0;
        int mVal = 0;
        int nVal = 0;
        ListNode mergedList = null;
        while(Temp != null){
            if(i == m){
                mVal = Temp.val;
            }
            if(i == n){
                nVal = Temp.val;
            }
            Temp = Temp.next;
        }
        i= 0;
        Temp = head;

        while(Temp != null){
            if(mergedList==null)  {
                mergedList = Temp;
                head = mergedList;
            }else {
                if(i == m){
                    Temp.val = nVal;
                }
                if(i == n){
                    Temp.val = mVal;
                }
            }
            Temp = Temp.next;
        }

        return head;
    }
}
