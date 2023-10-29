package Lecture16_Final;

import java.util.Scanner;

public class EulerCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int graph[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            graph[i] = new int[n];
            for (int j = 0; j < n; j++)
                graph[i][j] = sc.nextInt();
        }

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            int degree = 0;
            for (int j = 0; j < n; j++)
                degree += graph[i][j];
            if (degree % 2 != 0)
                flag = false;
        }

        if (flag)  {
            System.out.print("YES");
        }
        else  {
            System.out.print("NO");
        }
        sc.close();
    }
}
