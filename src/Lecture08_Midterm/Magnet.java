package Lecture08_Midterm;

import java.util.Scanner;

public class Magnet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        String prev = sc.next();

        for (int i = 1; i < n; i++) {
            String curr = sc.next();
            if (!curr.equals(prev)) {
                count++;
                prev = curr;
            }
        }
        System.out.println(count);
    }
}
