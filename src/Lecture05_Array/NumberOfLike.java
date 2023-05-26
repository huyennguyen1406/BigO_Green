package Lecture05_Array;

import java.util.Scanner;

public class NumberOfLike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            if (arr[i] == 0) {
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
}
