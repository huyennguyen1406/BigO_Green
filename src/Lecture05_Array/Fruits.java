package Lecture05_Array;

import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int mostApple = 0;
        int mostOrange = 0;
        int most = 1;

        for (int i = 1; i <= number; i++) {
            int apple = sc.nextInt();
            int orange = sc.nextInt();
            if (apple > mostApple) {
                mostApple = apple;
                mostOrange = orange;
                most = i;
            } else if (apple == mostApple && orange > mostOrange) {
                mostOrange = orange;
                most = i;
            }
        }
        System.out.println(most);
        sc.close();
    }
}
