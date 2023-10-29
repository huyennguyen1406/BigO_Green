package Lecture16_Final;

import java.util.Scanner;

class Node {
    public int data;
    public Node next;

    public Node() {
        data = 0;
        next = null;
    }

    public Node(int x) {
        data = x;
        next = null;
    }
}

public class LinkedList {
    public Node head;
    public Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void insertTail(int x) {
        Node p = new Node(x);
        if (head == null) {
            head = tail = p;
        } else {
            tail.next = p;
            tail = tail.next;
        }
    }

    public void getIntersection(LinkedList other) {
        Node cur1 = this.head, cur2 = other.head;
        Node pre1 = null, pre2 = null;
        boolean hasIntersection = false;

        while (cur1 != null && cur2 != null) {
            if ((cur1.data < cur2.data) || (pre1 != null && cur1.data == pre1.data)) {
                pre1 = cur1;
                cur1 = cur1.next;
            } else if ((cur1.data > cur2.data) || (pre2 != null && cur2.data == pre2.data)) {
                pre2 = cur2;
                cur2 = cur2.next;
            } else {
                hasIntersection = true;
                System.out.print(cur1.data + " ");
                pre1 = cur1;
                cur1 = cur1.next;
                pre2 = cur2;
                cur2 = cur2.next;
            }
        }

        if (!hasIntersection) {
            System.out.print("NO INTERSECTION");
        }
    }
}

class LinkedListExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        int n;
        while (true) {
            n = sc.nextInt();
            if (n == -1) {
                break;
            }
            l1.insertTail(n);
        }
        while (true) {
            n = sc.nextInt();
            if (n == -1) {
                break;
            }
            l2.insertTail(n);
        }
        sc.close();

        l1.getIntersection(l2);
    }
}
