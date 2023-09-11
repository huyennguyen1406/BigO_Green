package Lecture15_Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Edge {
    int u, v, weight;

    public Edge(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }
}
public class SumOfSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        List<Edge> edgeList = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();
            edgeList.add(new Edge(u, v, weight));
        }

        int minWeight = Integer.MAX_VALUE;
        for (Edge edge : edgeList) {
            int weight = edge.weight;
            if (weight < minWeight) {
                minWeight = weight;
            }
        }

        int sum = 0;
        for (Edge edge : edgeList) {
            int weight = edge.weight;
            if (weight == minWeight) {
                sum += weight;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
