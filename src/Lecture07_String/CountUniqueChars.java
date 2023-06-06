package Lecture07_String;

import java.util.Scanner;

public class CountUniqueChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] charCounts = new int[128];

        for (char c : s.toCharArray()) {
            charCounts[c]++;
        }
        int numUniqueChars = 0;
        for (int count : charCounts) {
            if (count > 0) {
                numUniqueChars++;
            }
        }
        System.out.println(numUniqueChars);
        sc.close();
    }
}
