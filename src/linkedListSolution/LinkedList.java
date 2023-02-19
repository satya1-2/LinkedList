package linkedListSolution;

import java.lang.*;

class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public boolean search(Node head, int x) {
        Node current = head;
        while (current != null) {
            if (current.data == x)
                return true;
            current = current.next;
        }
        return false;
    }

    public static void main(String args[]) {
        LinkedList llist = new LinkedList();

        llist.push(56);
        llist.push(30);
        llist.push(40);
        llist.push(70);

        if (llist.search(llist.head, 30))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}


