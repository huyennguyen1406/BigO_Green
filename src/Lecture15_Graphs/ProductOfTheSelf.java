package Lecture15_Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductOfTheSelf {
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

        int selfLoopCount = 0;
        long selfLoopWeightProduct = 1;

        for (Edge edge : edgeList) {
            int u = edge.u;
            int v = edge.v;
            int weight = edge.weight;

            if (u == v) {
                selfLoopCount++;
                selfLoopWeightProduct = (selfLoopWeightProduct * weight) % (1000007);
            }
        }

        if (selfLoopCount > 0) {
            System.out.println(selfLoopCount + " " + selfLoopWeightProduct);
        } else {
            System.out.println(-1);
        }
    }
}
