package com.cristian.problems.easy.tests;

import com.cristian.problems.easy.exercises.ListNode;

public class TestListNode {

    public ListNode sortMerge(ListNode listNode1, ListNode listNode2){
        ListNode test = new ListNode(2, new ListNode(2));
        return new ListNode();
    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // make the head and the tail of the node
        ListNode head = new ListNode();
        ListNode tail = head;
        // make a while loop to iterate the lists
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        tail.next = (list1 != null)? list1: list2;
        return head.next;

    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(3, new ListNode(5, new ListNode(5)));


        System.out.println(mergeTwoLists(list1, list2));




    }


}
