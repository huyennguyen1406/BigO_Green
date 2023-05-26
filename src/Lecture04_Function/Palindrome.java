package Lecture04_Function;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int rev = 0;
        int temp = st;
        while (temp > 0) {
            int digit = temp % 10;
            temp /= 10;
            rev = rev * 10 + digit;
        }
        if (st == rev) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
