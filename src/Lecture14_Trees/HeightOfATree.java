package Lecture14_Trees;

import java.util.Scanner;

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    public TreeNode1(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class HeightOfATree {
    public static TreeNode1 insertNode(TreeNode1 root, int val) {
        if (root == null) {
            return new TreeNode1(val);
        }

        if (val < root.val) {
            root.left = insertNode(root.left, val);
        } else {
            root.right = insertNode(root.right, val);
        }

        return root;
    }

    public static int getHeight(TreeNode1 root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] values = new int[N];

        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }

        TreeNode1 root = null;
        for (int value : values) {
            root = insertNode(root, value);
        }

        int height = getHeight(root);
        System.out.println(height);
        sc.close();
    }
}
