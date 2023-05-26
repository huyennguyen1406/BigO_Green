package Lecture03_LoopStatement;

import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        int prev = 0;
        while (true) {
            int height = scanner.nextInt();

            if (height == 0) {
                break;
            }
            if (height < prev) {
                isValid = false;
            }
            prev = height;
        }
        if (isValid) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
