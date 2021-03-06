package com.hawkins;

import java.util.HashMap;
import java.util.Map;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
    val = x;
    next = null;
    }
}

public class IntersectLink {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<Integer,Integer> map = new HashMap<>();
        while(headA != null){
            if(map.containsKey(headB.val)) {
                map.merge(headB.val, 1, Integer::sum);
            }
            else{
                map.put(headB.val,1);
            }
            headA = headA.next;
        }
        while(headB != null){
            if(map.containsKey(headB.val)) {
                return headB;
            }
            headA = headA.next;
        }
        return null;
    }
}
