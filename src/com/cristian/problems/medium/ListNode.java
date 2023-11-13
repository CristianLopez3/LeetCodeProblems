package com.cristian.problems.medium;

public class ListNode {
    int val;
    ListNode next;
    public ListNode(){}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListNode{val=").append(val);

        if (next != null) {
            sb.append(", next=").append(next.val);
        } else {
            sb.append(", next=null");
        }

        sb.append('}');
        return sb.toString();
    }


}
