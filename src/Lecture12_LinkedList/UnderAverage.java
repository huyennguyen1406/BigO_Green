package Lecture12_LinkedList;

import java.util.Scanner;
import java.util.LinkedList;

public class UnderAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Double> list = new LinkedList<>();

        double point = sc.nextDouble();
        while (point != -1) {
            list.add(point);
            point = sc.nextDouble();
        }

        for (double num : list) {
            if (num < 5.0) {
                System.out.println(num);
            }
        }
        sc.close();
    }
}
