package Lecture06_2DArray;

import java.util.Scanner;

public class EvenRow {
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

        int maxEven = 0;
        int index = -1;

        for (int i = 0; i < m; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (a[i][j] % 2 == 0)
                    cnt += 1;
            }
            if (cnt > maxEven) {
                index = i;
                maxEven = cnt;
            }
        }
        System.out.println(index);
    }
}
