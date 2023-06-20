package Lecture09_Recursion;

import java.util.Scanner;

public class SymmetricalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        boolean isSymmetric = true;

        for (int i = 0; i <  n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                isSymmetric = false;
                break;
            }
        }
        if (isSymmetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
            sc.close();
        }
    }
}
