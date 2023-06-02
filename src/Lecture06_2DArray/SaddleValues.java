package Lecture06_2DArray;

import java.util.Scanner;

public class SaddleValues {
    public static boolean checkMaxRow(int a[][], int n, int row, int col) {
        for (int j = 0; j < n; j++)
            if (a[row][j] > a[row][col])
                return false;
        return true;
    }

    public static boolean checkMinCol(int a[][], int m, int row, int col) {
        for (int i = 0; i < m; i++)
            if (a[i][col] < a[row][col])
                return false;
        return true;
    }

    public static boolean isSaddle(int a[][], int m, int n, int row, int col) {
        if (checkMaxRow(a, n, row, col) && checkMinCol(a, m, row, col))
            return true;
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][];
        for (int i = 0; i < m; i++)
            a[i] = new int[n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        int cnt = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isSaddle(a, m, n, i, j))
                    cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
