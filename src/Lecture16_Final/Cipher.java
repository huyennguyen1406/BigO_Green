package Lecture16_Final;

import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                t += s.charAt(i);
            }
        }

        for (int i = 0, j = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(t.charAt(j));
                j++;
            }
            else {
                System.out.print(s.charAt(i));
                sc.close();
            }
        }
    }
}
