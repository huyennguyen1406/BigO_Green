package Lecture14_Trees;

import java.util.Scanner;

public class SumOfLeafNodes {
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

    public static int sumLeafNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return root.val;
        }

        int leftSum = sumLeafNodes(root.left);
        int rightSum = sumLeafNodes(root.right);

        return leftSum + rightSum;
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

        int sum = sumLeafNodes(root);
        System.out.println(sum);
        sc.close();
    }
}
