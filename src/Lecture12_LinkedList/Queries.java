package Lecture12_LinkedList;

import java.util.Scanner;

public class Queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            int query = sc.nextInt();
            if (query == 0) {
                if (head != null) {
                    head = head.next;
                    if (head == null) {
                        tail = null;
                    }
                }
            } else if (query == 1) {
                int x = sc.nextInt();
                Node newNode = new Node(x);
                if (tail == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        sc.close();
    }
}
class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
