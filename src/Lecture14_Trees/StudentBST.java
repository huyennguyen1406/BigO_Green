package Lecture14_Trees;

import java.util.Scanner;

class Student {
    String mssv;
    String name;
    double score;

    public Student(String mssv, String name, double score) {
        this.mssv = mssv;
        this.name = name;
        this.score = score;
    }
}

class TreeNodeStudent {
    Student student;
    TreeNodeStudent left;
    TreeNodeStudent right;

    public TreeNodeStudent(Student student) {
        this.student = student;
        left = null;
        right = null;
    }
}

public class StudentBST {
    public static TreeNodeStudent insertNode(TreeNodeStudent root, Student student) {
        if (root == null) {
            return new TreeNodeStudent(student);
        }

        if (student.score < root.student.score) {
            root.left = insertNode(root.left, student);
        } else {
            root.right = insertNode(root.right, student);
        }

        return root;
    }

    public static Student findMaxScoreStudent(TreeNodeStudent root) {
        if (root == null) {
            return null;
        }

        while (root.right != null) {
            root = root.right;
        }

        return root.student;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        TreeNodeStudent root = null;

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            String mssv = parts[0];
            String name = parts[1];
            double score = Double.parseDouble(parts[2]);

            Student student = new Student(mssv, name, score);
            root = insertNode(root, student);
        }

        Student maxScoreStudent = findMaxScoreStudent(root);

        System.out.println(maxScoreStudent.mssv + " " + maxScoreStudent.name + " " + maxScoreStudent.score);
    }
}
