package Lecture13_Review;

import java.util.LinkedList;
import java.util.Scanner;

public class FirstCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        LinkedList<Character> charList = new LinkedList<>();

        for (char ch : input.toCharArray()) {
            if (charList.contains(ch)) {
                System.out.println(ch);
                return;
            }
            charList.add(ch);
        }
        System.out.println("null");
        sc.close();
    }
}
