package Lecture07_String;

import java.util.Scanner;

public class StandardizeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        int j = str.length() - 1;
        while (j >= 0 && str.charAt(j) == ' ') {
            j--;
        }
        str = str.substring(i, j + 1).replaceAll("\\s+", " ");
        System.out.println(str);
        sc.close();
    }
}
