package Lecture07_String;

import java.util.Scanner;

public class CapitalAfterDot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.' && i+1 < s.length() && s.charAt(i+1) == ' ') {
                result += s.charAt(i) + " " + Character.toUpperCase(s.charAt(i+2));
                i += 2;
            } else {
                result += s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
