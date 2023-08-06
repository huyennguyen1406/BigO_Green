package Lecture12_LinkedList;


import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;
    private Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeElementsWithTrailing5() {
        if (head == null) {
            return;
        }

        while (head != null && Math.abs(head.data) % 10 == 5) {
            head = head.next;
        }

        Node current = head;
        Node prev = null;

        while (current != null) {
            if (Math.abs(current.data) % 10 == 5) {
                if(prev != null) {
                    prev.next = current.next;
                }
                current = current.next;
            } else {
                prev = current;
                current = current.next;
            }
        }

        tail = prev;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
public class EndingWith5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList list = new LinkedList();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        list.removeElementsWithTrailing5();
        list.printList();

        sc.close();
    }
}
