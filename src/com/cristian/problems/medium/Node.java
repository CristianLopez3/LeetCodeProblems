package com.cristian.problems.medium;

public class Node {
    int val;
    Node next;
    public Node(){}
    public Node(int val){this.val = val;}
    public Node(int val, Node next){this.val = val; this.next = next; }

    public void insert(Node head, int val){
        // creamos un nuevo nodo
        Node newNode = new Node(val);
        /*
         Validamos que no haya un nodo al final (insertado previavente)
         Si hay un nodo insertado con anterioridad moveremos la cabeza al siguiente nodo
         para poder insertar los datos en el siguiente node
        */
        while(head.next != null){
            head = head.next;
        }

        // insertamos el nuevo nodo al final
        head.next = newNode;
    }
    public  int length(Node head){
        int length = 0;
        while(head != null){
            length += 1;
            head = head.next;
        }
        return length;

    }

    public Node deleteLastNode(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
         return head;

    }

    public Node reverselist(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        System.out.println("current value before while: " + current.listToString(current));
        int count = 1;

        while(current != null) {
            next = current.next; // ( 2, 3 ) ( 3 )
            if(next != null)
                System.out.println("Next in iteration " + count + " : " + next.listToString(next));

            current.next = prev; // (null) (1) (2, 1)

            if(current.next != null)
                System.out.println("Current.next in iteration " + count + " : " + current.next.listToString(current.next));

            prev = current; // ( 1 ) (2, 1) (3, 2, 1 )
            System.out.println("prev value in " + count + " iteration "+prev.listToString(prev));
            System.out.println("current at the end " + count + " : " + current.listToString(current));
            System.out.println("----------------------------------------------------------------------------------------------");

            current =  next; // (2, 3) (3) (null)
            count = count + 1;
        }


        return prev;

    }

    public String listToString(Node head) {
        StringBuilder result = new StringBuilder("[");

        while (head != null) {
            result.append(head.val);

            if (head.next != null) {
                result.append(" -> ");
            }

            head = head.next;
        }

        result.append("]");
        return result.toString();
    }



}
