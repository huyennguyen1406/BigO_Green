package Lecture03_LoopStatement;

import java.util.Scanner;

public class CountingStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int number;
        while (1 < 2) {
            number = sc.nextInt();
            if (number == 5) {
                count++;
            }
            if (number == 0) {
                break;
            }
        }
        System.out.print(count);
    }
}
