package Lecture09_Recursion;

import java.util.Scanner;

public class SymmetricalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String result = isPalindrome(s) ? "YES" : "NO";
        System.out.println(result);
        sc.close();

    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        } else {
            if (s.charAt(0) != s.charAt(s.length() - 1)) {
                return false;
            } else {
                String subString = s.substring(1, s.length() - 1);
                return isPalindrome(subString);
            }
        }
    }
}
