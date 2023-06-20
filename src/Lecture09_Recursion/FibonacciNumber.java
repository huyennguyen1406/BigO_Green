package Lecture09_Recursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static int Fib(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        else if (n == 0) {
            return 1;
        } else {
            return Fib(n - 1) + Fib(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fib(n));
        sc.close();
    }
}
