package Lecture03_LoopStatement;

import java.util.Scanner;

public class FibonacciLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        if (N == 1) {
            System.out.println("Fibonacci " + N + " is: 1");
            return;
        } else if (N == 2) {
            System.out.println("Fibonacci " + N + " is: 2");
            return;
        }

        int fib1 = 1;
        int fib2 = 2;
        int fibN = 0;

        for (int i = 3; i <= N; i++) {
            fibN = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibN;
        }

        System.out.println("Fibonacci " + N + " is: " + fibN);
        sc.close();
    }
}
