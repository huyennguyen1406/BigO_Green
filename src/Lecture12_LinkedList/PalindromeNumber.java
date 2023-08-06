package Lecture12_LinkedList;

import java.util.Scanner;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedListPalindrome {
    Node head;
    Node tail;

    public void addNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void findPalindromeNodes() {
        Node current = head;
        int position = 0;

        while (current != null) {
            if (isPalindrome(current.value)) {
                System.out.print(position + " ");
            }
            current = current.next;
            position++;
        }
    }

    private boolean isPalindrome(int number) {
        String numString = String.valueOf(number);
        int left = 0;
        int right = numString.length() - 1;

        while (left < right) {
            if(numString.charAt(left) != numString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListPalindrome list = new LinkedListPalindrome();

        int value;
        while ((value = sc.nextInt()) != -1) {
            list.addNode(value);
        }
        list.findPalindromeNodes();
        sc.close();
    }
}
