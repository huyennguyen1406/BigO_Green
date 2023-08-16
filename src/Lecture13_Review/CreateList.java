package Lecture13_Review;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class CreateList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ListNode head = new ListNode(sc.nextInt());
        ListNode curr = head;

        for (int i = 1; i < n; i++) {
            int val = sc.nextInt();
            ListNode newNode = new ListNode(val);
            curr.next = newNode;
            curr = newNode;
        }

        ListNode newHead = buildNewLinkedList(head);
        printLinkedList(newHead);
        sc.close();
    }

    public static ListNode buildNewLinkedList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode newHead = new ListNode(head.val);
        ListNode currNode = newHead;
        ListNode prevNode = head;
        int i = 2;

        while (head.next != null) {
            head = head.next;
            int sum = head.val + prevNode.val;
            ListNode newNode = new ListNode(sum);
            currNode.next = newNode;
            currNode = newNode;
            prevNode = head;
            i++;
        }
        return newHead;
    }

    public static void printLinkedList (ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) {
                System.out.print(" ");
            }
            curr = curr.next;
        }
    }
}
