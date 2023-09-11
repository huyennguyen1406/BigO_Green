package Lecture15_Graphs;

import java.util.*;

public class AdjacencyEdge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int K = sc.nextInt();
        Edge[] edgeArray = new Edge[M];

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();
            edgeArray[i] = new Edge(u, v, weight);
        }

        PriorityQueue<Edge> minHeap = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
        for (Edge edge : edgeArray) {
            minHeap.offer(edge);
        }

        List<Edge> kSmallestEdges = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            Edge edge = minHeap.poll();
            kSmallestEdges.add(edge);
        }

        Collections.sort(kSmallestEdges, Comparator.comparingInt(e -> -e.weight));

        for (Edge edge : kSmallestEdges) {
            System.out.println(edge.u + " " + edge.v);
        }
    }
}
