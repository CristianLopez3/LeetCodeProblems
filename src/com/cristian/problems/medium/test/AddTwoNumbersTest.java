package com.cristian.problems.medium.test;

import com.cristian.problems.medium.problem.AddTwoNumbers;
import com.cristian.problems.medium.problem.ListNode;

public class AddTwoNumbersTest {
    public static void main(String args[]){
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode l2 = new ListNode(2, new ListNode(0, new ListNode(3)));
        ListNode finalListNode = AddTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(finalListNode.toString());
    }
}
