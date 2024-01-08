package com.cristian.problems.medium.problem;

import com.cristian.problems.medium.problem.ListNode    ;

public class AddTwoNumbers {

    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order, and each of their nodes contains a
     * single digit. Add the two numbers and return the sum as a linked list.
     *
     * You may assume the two numbers do not contain any leading zero,
     * except the number 0 itself.
     */

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        if(l1 == null && l2 == null) return null;
        if(l1 == null) l1 = new ListNode(0);
        if(l2 == null) l2 = new ListNode(0);

        int value = l1.val + l2.val;

        if(value > 9){
            value %= 10;
            if(l1.next == null){
                l1.next = new ListNode(1);
            } else {
                l1.next.val = l1.next.val + 1;
            }
        }

        return new ListNode(value, addTwoNumbers(l1.next, l2.next));

    }

    /**
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [7,0,8]
     * Explanation: 342 + 465 = 807.
     */

}
