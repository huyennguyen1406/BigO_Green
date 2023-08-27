package Lecture14_Trees;

import java.util.Scanner;

public class ListEvenNumber {
    public static TreeNode insertNode(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insertNode(root.left, val);
        } else {
            root.right = insertNode(root.right, val);
        }

        return root;
    }

    public static void postorderTraversal(TreeNode root, int[] result, int[] count) {
        if (root == null) {
            return;
        }

        postorderTraversal(root.left, result, count);
        postorderTraversal(root.right, result, count);

        if (root.val % 2 == 0) {
            result[count[0]] = root.val;
            count[0]++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] values = new int[N];

        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }

        TreeNode root = null;
        for (int value : values) {
            root = insertNode(root, value);
        }

        int[] result = new int[N];
        int[] count = new int[1];

        postorderTraversal(root, result, count);

        for (int i = 0; i < count[0]; i++) {
            System.out.print(result[i] + " ");
            sc.close();
        }
    }
}
