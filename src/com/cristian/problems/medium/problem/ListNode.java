package com.cristian.problems.medium.problem;

import java.util.List;

public class ListNode {
     int val;
     ListNode next;

    public ListNode(){}

    public ListNode(int val){
        this.val = val;
    }

    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }


    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("first: ");
        ListNode current = this;
        while(current != null){
            string.append(current.val).append(" next: " );
            current = current.next;
        }
        string.append(" null");
        return string.toString();
    }
}
