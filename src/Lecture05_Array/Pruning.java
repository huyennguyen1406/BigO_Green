package Lecture05_Array;

import java.util.Scanner;

public class Pruning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] heights = new int[num];
        for (int i = 0; i < num; i++) {
            heights[i] = sc.nextInt();
        }
        int minHeight = Integer.MAX_VALUE;
        for (int height : heights) {
             minHeight = Math.min(height, minHeight);
        }
        int energy = 0;
        for (int height : heights) {
            if (height != minHeight) {
                energy += (height - minHeight);
            }
        }
        System.out.println(energy);
        sc.close();
    }
}
