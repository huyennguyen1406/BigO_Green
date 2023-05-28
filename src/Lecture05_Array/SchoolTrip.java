package Lecture05_Array;

import java.util.Scanner;

public class SchoolTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count1 = 0, count2 = 0;

        for (int i = 0; i < num; i++) {
            int gender = sc.nextInt();
            if (gender == 0) {
                count1++;
            } else {
                count2++;
            }
        }

        if (count1 == count2) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
