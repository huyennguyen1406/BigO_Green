package Lecture08_Midterm;

import java.util.Scanner;

public class TaxiFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();

        int price = 0;
        if (km < 1) {
            price = 15000;
        } else if (km <= 5) {
            price = 15000 + (km - 1) *13500;
        } else {
            price = 15000 + 4 * 13500 + (km - 5) * 11000;
        }

        double precent = 0;
        if (km >= 12) {
            precent = 0.1;
        }
        int total = (int)Math.round(price * (1 - precent));
        System.out.print(total);
    }
}
