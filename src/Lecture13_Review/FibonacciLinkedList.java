package Lecture13_Review;

import java.util.LinkedList;
import java.util.Scanner;

public class FibonacciLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();

        LinkedList<Integer> fiboList = new LinkedList<>();

        fiboList.add(x);
        fiboList.add(y);

        int prev1 = x;
        int prev2 = y;
        for (int i = 2; i < n; i++) {
            int sum = prev1 % 1000007 + prev2 % 1000007;
            fiboList.add(sum % 1000007);
            prev1 = prev2;
            prev2 = sum;
        }

        for (int num : fiboList) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
