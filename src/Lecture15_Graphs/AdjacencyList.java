package Lecture15_Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdjacencyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        List<List<Integer>> adjacencyList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            List<Integer> neighbors = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 1) {
                    neighbors.add(j);
                }
            }
            adjacencyList.add(neighbors);
        }

        List<int[]> edgeList = new ArrayList<>();
        int M = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < adjacencyList.get(i).size(); j++) {
                int u = i;
                int v = adjacencyList.get(i).get(j);
                edgeList.add(new int[]{u, v});
                M++;
            }
        }

        System.out.println(M);
        for (int[] edge : edgeList) {
            System.out.println(edge[0] + " " + edge[1]);
        }
    }
}
