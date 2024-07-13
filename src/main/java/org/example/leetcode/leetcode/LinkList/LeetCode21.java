package org.example.leetcode.leetcode.LinkList;

public class LeetCode21 {



    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null ) return list2;
        if (list2 == null ) return list1;

        ListNode head = new ListNode(-1);
        ListNode pre = head;
        while (list1 != null && list2 != null){
            if (list2.val > list1.val) {

                pre.next = list1;
                list1 = list1.next;
            } else {

                pre.next = list2;
                list2 = list2.next;
            }
            pre =pre.next;
        }
        pre.next = list1==null?list2:list1;
         return  head.next;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }


}
