package Lecture14_Trees;

import java.util.Scanner;

class Node {
    int value;
    Node left;
    Node right;

    public Node (int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class FindMiniElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        Node root = buildBST(numbers);
        int min = findMinValue(root);
        System.out.println(min);
    }

    public static Node buildBST(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }

        Node root = new Node(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            insertNode(root, numbers[i]);
        }
        return root;
    }

    public static void insertNode(Node root, int value) {
        if (value < root.value) {
            if (root.left == null) {
                root.left = new Node(value);
            } else {
                insertNode(root.left, value);
            }
        } else {
            if(root.right == null) {
                root.right = new Node(value);
            } else {
                insertNode(root.right, value);
            }
        }
    }

    public static int findMinValue(Node root) {
        if (root == null) {
            return -1;
        }

        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.value;
    }
}
