package Lecture04_Function;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.print(sum);
    }
}
