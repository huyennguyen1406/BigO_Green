package Lecture05_Array;

import java.util.Scanner;

public class PrimesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }
        System.out.print(count);
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
