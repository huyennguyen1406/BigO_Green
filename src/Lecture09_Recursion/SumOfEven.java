package Lecture09_Recursion;

import java.util.Scanner;

public class SumOfEven {
    public static int sum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            int s = sum(arr, n-1);
            if (arr[n-1] % 2 == 0) {
                s += arr[n-1];
            }
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr, n));
        sc.close();
    }
}
