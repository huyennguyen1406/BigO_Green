package Lecture14_Trees;

import java.util.Scanner;

public class SumValue {
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

    public static int sumNodesLessThanX(TreeNode root, int X) {
        if (root == null) {
            return 0;
        }

        if (root.val >= X) {
            return sumNodesLessThanX(root.left, X);
        }

        return root.val + sumNodesLessThanX(root.left, X) + sumNodesLessThanX(root.right, X);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] values = new int[N];

        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }

        TreeNode root = null;
        for (int value : values) {
            root = insertNode(root, value);
        }

        int sum = sumNodesLessThanX(root, X);

        System.out.println(sum);
        sc.close();
    }
}
