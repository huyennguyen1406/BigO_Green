package Lecture16_Final;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] res = new int[6];
        res[0] = a + b + c;
        res[1] = a * b * c;
        res[2] = a + b * c;
        res[3] = a * b + c;
        res[4] = (a + b) * c;
        res[5] = a * (b + c);

        int ans = 0;
        for(int i = 0; i < 6; i++) {
            if (ans < res[i]) {
                ans = res[i];
            }
        }
        System.out.print(ans);
        sc.close();
    }
}
