package Lecture12_LinkedList;

import java.util.Scanner;
import java.util.LinkedList;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList <Double> numbers = new LinkedList<>();

        while (true) {
            double num = sc.nextDouble();
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }

        double max_value = Double.NEGATIVE_INFINITY;
        double second_max_value = Double.NEGATIVE_INFINITY;

        for (double num : numbers) {
            if (num > max_value) {
                second_max_value = max_value;
                max_value = num;
            }
            else if (num > second_max_value && num < max_value) {
                second_max_value = num;
            }
        }

        if (second_max_value != Double.NEGATIVE_INFINITY) {
            System.out.println(second_max_value);
        } else {
            System.out.println(-1);
        }
        sc.close();
    }
}
