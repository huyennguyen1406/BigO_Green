package Lecture15_Graphs;

import java.util.Scanner;

public class UndirectedGraphCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] adjMatrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                adjMatrix[i][j] = sc.nextInt();
            }
        }

        boolean isUndirected = isUndirectedGraph(adjMatrix);
        if (isUndirected) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isUndirectedGraph(int[][] adjMatrix) {
        int N = adjMatrix.length;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (adjMatrix[i][j] != adjMatrix[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
