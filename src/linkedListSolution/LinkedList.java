package linkedListSolution;

public class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }

    //delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("this list is empty");
            return;
        }
        head = head.next;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(56);
        list.append(30);
        list.append(70);
        list.printList();
        System.out.println("after deleting first");
        list.deleteFirst();
        list.printList();
    }
}

