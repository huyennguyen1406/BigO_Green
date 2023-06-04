package Lecture07_String;

import java.util.Scanner;

public class Reversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
            sc.close();
        }
    }
}
