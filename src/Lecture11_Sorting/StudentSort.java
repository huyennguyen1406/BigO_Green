package Lecture11_Sorting;

import java.util.Scanner;

public class StudentSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Student[] students = new Student[n];
        boolean[] used = new boolean[n];

        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            double score = scanner.nextDouble();
            students[i] = new Student(id, score);
        }

        int printed = 0;
        while (printed < k) {
            int maxIndex = -1;
            for (int i = 0; i < n; i++) {
                if (!used[i] && (maxIndex == -1 || students[i].score > students[maxIndex].score ||
                        (students[i].score == students[maxIndex].score && students[i].id < students[maxIndex].id))) {
                    maxIndex = i;
                }
            }
            if (maxIndex == -1) {
                break;
            }
            System.out.println(students[maxIndex].id);
            used[maxIndex] = true;
            printed++;
        }
    }
}
class Student {
    public int id;
    public double score;

    public Student(int id, double score) {
        this.id = id;
        this.score = score;
    }
}
