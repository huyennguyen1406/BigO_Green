package Lecture06_2DArray;

import java.util.Scanner;

public class CountQueens {
    public static boolean check1(int a[][], int n, int x, int y) {
        for (int j = 0; j < n; j++)
            if (a[x][j] > a[x][y])
                return false;
        return true;
    }
    public static boolean check2(int a[][], int n, int x, int y) {
        for (int i = 0; i < n; i++)
            if (a[i][y] > a[x][y])
                return false;
        return true;
    }
    public static boolean check3(int a[][], int n, int x, int y) {
        for (int k = Math.max(-x, -y); k <= Math.min(n - x - 1, n - y - 1); k++)
            if (a[x + k][y + k] > a[x][y])
                return false;
        return true;
    }
    public static boolean check4(int a[][], int n, int x, int y) {
        for (int k = Math.max(-x, - n + y + 1); k <= Math.min(n - x - 1, y); k++)
            if (a[x + k][y - k] > a[x][y])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[][] = new int[n][];
        for (int i = 0; i < n; i++)
            a[i] = new int[n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (check1(a, n, i, j) && check2(a, n, i, j) && check3(a, n, i, j) && check4(a, n, i, j))
                    count += 1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
