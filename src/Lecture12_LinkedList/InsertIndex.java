package Lecture12_LinkedList;

import java.util.Scanner;

public class InsertIndex {
    static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this(data, null);
        }
    }

    static Node createLinkedList(int[] numbers) {
        Node head = null;
        Node tail = null;
        for (int num : numbers) {
            if (num == 0) {
                break;
            }
            Node newNode = new Node(num);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }
        return head;
    }

    static Node insertIndices(Node head) {
        Node current = head;
        int index = 1;
        while (current != null) {
            Node newNode = new Node(index, current);
            current = current.next;
            index++;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[100000];
        int i = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            numbers[i] = num;
            i++;
        }
        Node head = createLinkedList(numbers);
        head = insertIndices(head);
        Node current = head;
        int index = 1;
        while (current != null) {
            System.out.print(index + " " + current.data + " ");
            current = current.next;
            index++;
            sc.close();
        }
    }
}
