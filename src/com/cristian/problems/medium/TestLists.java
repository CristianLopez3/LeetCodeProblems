package com.cristian.problems.medium;

public class TestLists {

    public static void main(String[] args) {
        System.out.println("Reverse List");
        Node v1 = new Node(1);
        v1.insert(v1, 2);
        v1.insert(v1, 3);
//        System.out.println(v1.listToString(v1));
        Node reverse = v1.reverselist(v1);
//        System.out.println(reverse.listToString(reverse));


    }

    public static void nodeLength(){
        System.out.println("Node List");
        Node v1 = new Node(4);
        Node v2 = new Node(3);
        Node v3 = new Node(5);
        Node v4 = new Node(3);

        v1.next = v2;
        v2.next = v3;
        v3.next = v4;

        System.out.println(v1.length(v1));
    }

    public static void insertAtTheEnd(){
        System.out.println("Insert at the end");
        Node v1 = new Node();
        v1.insert(v1, 2);
        v1.insert(v1, 3);

        System.out.println(v1.length(v1));
    }

    public static void deleteTheEnd(){
        System.out.println("Delete at the End");
        Node node1 = new Node(1);
        node1.insert(node1, 2);
        node1.insert(node1, 3);
        node1.insert(node1, 4);
        System.out.println(node1.length(node1));
        node1.deleteLastNode(node1);
        System.out.println(node1.length(node1));
    }




}
