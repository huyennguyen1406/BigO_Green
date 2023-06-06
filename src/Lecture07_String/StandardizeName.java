package Lecture07_String;

import java.util.Scanner;

public class StandardizeName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String[] words = name.split("\\s+");
            for (int j = 0; j < words.length; j++) {
                String word = words[j];
                if (word.length() > 0) {
                    char firstChar = Character.toUpperCase(word.charAt(0));
                    String restOfWord = word.substring(1).toLowerCase();
                    words[j] = firstChar + restOfWord;
                }
            }
            String normalizedName = String.join(" ", words);
            System.out.println(normalizedName);
        }
        sc.close();
    }
}
