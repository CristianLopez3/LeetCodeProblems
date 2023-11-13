package com.cristian.problems.medium;


/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits
 * are stored in reverse order, and each of their nodes contains a single digit. Add the two
 * numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {


    public static void main(String[] args) {
        System.out.println("AddTwoNumbers: exercise number 2 in Leetcode.");
//        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
//        System.out.println(l1.toString());



        // Crear nodos
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        // Establecer relaciones entre nodos
        node1.next = node2;
        node2.next = node3;

        // Imprimir información de los nodos
        System.out.println("Información del primer nodo:");
        System.out.println(node1);

        System.out.println("\nInformación del segundo nodo:");
        System.out.println(node2);
        System.out.println("\nInformación del tercer nodo:");
        System.out.println(node3);


    }

    /**
     * Example 1:
     *
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [7,0,8]
     * Explanation: 342 + 465 = 807.
     */

    /**
     * Example 2:
     *
     * Input: l1 = [0], l2 = [0]
     * Output: [0]
     */

}
