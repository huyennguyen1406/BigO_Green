package Lecture07_String;

import java.util.Scanner;

public class CheckChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        boolean containsBigO = false;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'b' || ch == 'i' || ch == 'g' || ch == 'o') {
                containsBigO = true;
                break;
            }
        }
        System.out.println(containsBigO ? "YES" : "NO");
        sc.close();
    }
}
