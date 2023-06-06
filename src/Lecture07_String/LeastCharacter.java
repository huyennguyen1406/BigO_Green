package Lecture07_String;

import java.util.Scanner;

public class LeastCharacter {
    public static void main(String[] args ){
        int[] count = null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            count = new int[26];
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if ('A' <= c && c <= 'Z') {
                    c = (char)(c + 32);
                }
                count[c - 'a']++;
            }
            int minCount = Integer.MAX_VALUE;
            char minChar = 'A';
            for (int k = 0; k < 26; k++) {
                if (count[k] < minCount && count[k] != 0) {
                    minCount = count[k];
                    minChar = (char)(k + 'a');
                }
            }
            System.out.println(Character.toUpperCase(minChar));
            sc.close();
        }
    }
}
