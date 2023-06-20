package Lecture09_Recursion;

import java.util.Scanner;

public class GreatestCommonDiv {
    public static int gcd(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        } else {
            return gcd(number2, number1 % number2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println(gcd(number1, number2));\
        sc.close();
    }
}
