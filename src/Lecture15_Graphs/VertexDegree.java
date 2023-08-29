package Lecture15_Graphs;

import java.util.Scanner;

public class VertexDegree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[][] adjMatrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                adjMatrix[i][j] = sc.nextInt();
            }
        }

        int degree = calculateDegree(adjMatrix, X);
        System.out.println(degree);
        sc.close();
    }

    public static int calculateDegree(int[][] adjMatrix, int X) {
        int degree = 0;
        int N = adjMatrix.length;

        for (int i = 0; i < N; i++) {
            degree += adjMatrix[X][i];
        }

        return degree;
    }
}
