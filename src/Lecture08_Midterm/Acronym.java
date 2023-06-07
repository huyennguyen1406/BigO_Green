package Lecture08_Midterm;

import java.util.Scanner;

public class Acronym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String songName = sc.nextLine().trim();
        String[] words = songName.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)));
        }
        System.out.println(result.toString());
        sc.close();
    }
}
