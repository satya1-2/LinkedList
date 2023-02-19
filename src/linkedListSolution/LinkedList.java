package linkedListSolution;

import java.util.*;
import java.lang.*;
import java.io.*;

class LinkedList {
        Node head; // head of list

        /* Linked list Node*/
        class Node {
            int data;
            Node next;
            Node(int d)
            {
                data = d;
                next = null;
            }
        }

        /* function to insert a
    new_node in a list. */
        void sortedInsert(Node new_node)
        {
            Node current;

            /* Special case for head node */
            if (head == null || head.data
                    >= new_node.data) {
                new_node.next = head;
                head = new_node;
            }
            else {

                /* Locate the node before point of insertion. */
                current = head;

                while (current.next != null
                        && current.next.data < new_node.data) {

                    current = current.next;
                }

                new_node.next = current.next;
                current.next = new_node;
            }
        }

        /*Utility functions*/

        /* Function to create a node */
        Node newNode(int data)
        {
            Node x = new Node(data);
            return x;
        }

        /* Function to print linked list */
        void printList()
        {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        /* Driver function to test above methods */
        public static void main(String args[])
        {
            LinkedList llist = new LinkedList();
            Node new_node;
            new_node = llist.newNode(56);
            llist.sortedInsert(new_node);
            new_node = llist.newNode(30);
            llist.sortedInsert(new_node);
            new_node = llist.newNode(40);
            llist.sortedInsert(new_node);
            new_node = llist.newNode(70);
            llist.sortedInsert(new_node);
            System.out.println("sorted Linked List");
            llist.printList();
        }
    }