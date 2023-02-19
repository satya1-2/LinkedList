package linkedListSolution;

public class LinkedList {
    class Node {
        int key;
        Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addAtStart(int key) {
        Node newNode = new Node(key);

        //Checks if the list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Adding nodes  to the start of the list: ");
        while (current != null) {
            System.out.print(current.key + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedList List = new LinkedList();

        //Adding 1 to the list
        List.addAtStart(70);
        List.display();

        //Adding 2 to the list
        List.addAtStart(30);
        List.display();

        //Adding 3 to the list
        List.addAtStart(56);
        List.display();
    }
}


