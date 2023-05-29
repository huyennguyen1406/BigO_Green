package Lecture05_Array;

import java.util.Scanner;

public class EmployeeID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean[] usedIds = new boolean[100001];

        for (int i = 0; i < num; i++) {
            int id = sc.nextInt();
            usedIds[id] = true;
        }

        for (int i = 1; i <= 100000; i++) {
            if (!usedIds[i]) {
                System.out.print(i);
                break;
            }
        }
    }
}
