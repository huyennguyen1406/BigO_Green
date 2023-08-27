package Lecture14_Trees;

import java.util.Scanner;

public class CountNodes2Children {
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

    public static int countNodesWithTwoChildren(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        if (root.left != null && root.right != null) {
            count = 1;
        }

        count += countNodesWithTwoChildren(root.left);
        count += countNodesWithTwoChildren(root.right);

        return count;
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

        int count = countNodesWithTwoChildren(root);
        System.out.println(count);
        sc.close();
    }
}
