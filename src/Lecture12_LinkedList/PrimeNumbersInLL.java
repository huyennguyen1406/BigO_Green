package Lecture12_LinkedList;

import java.util.Scanner;

public class PrimeNumbersInLL {
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

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static Node createLinkedList(int[] numbers) {
        Node head = null;
        Node tail = null;
        for (int num : numbers) {
            if (num == -1) {
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

    static int countPrimes(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (isPrime(current.data)) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[100000];
        int i = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            numbers[i] = num;
            i++;
        }
        Node head = createLinkedList(numbers);
        int count = countPrimes(head);
        System.out.println(count);
        sc.close();
    }
}
