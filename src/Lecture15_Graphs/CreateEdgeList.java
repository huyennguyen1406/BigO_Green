package Lecture15_Graphs;

import java.util.Scanner;

public class CreateEdgeList {
    static class Edge {
        int u;
        int v;
        public Edge(int u, int v) {
            this.u = u;
            this.v = v;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] adjMatrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                adjMatrix[i][j] = sc.nextInt();
            }
        }

        Edge[] edges = adjacencyMatrixToEdgeList(adjMatrix);

        int M = edges.length;
        System.out.println(M);
        for (Edge edge : edges) {
            System.out.println(edge.u + " " + edge.v);
        }
    }

    public static Edge[] adjacencyMatrixToEdgeList(int[][] adjMatrix) {
        int N = adjMatrix.length;
        int maxEdges = (N * (N - 1)) / 2;
        Edge[] edges = new Edge[maxEdges];
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (adjMatrix[i][j] == 1) {
                    edges[count] = new Edge(i, j);
                    count++;
                }
            }
        }
        edges = resizeArray(edges, count);
        return edges;
    }

    public static Edge[] resizeArray(Edge[] array, int newSize) {
        Edge[] newArray = new Edge[newSize];
        System.arraycopy(array, 0, newArray, 0, newSize);
        return newArray;
    }
}
