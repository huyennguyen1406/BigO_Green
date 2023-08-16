package Lecture12_LinkedList;

import java.util.Scanner;

public class GreatestDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int maxDay = 0, maxMonth = 0, maxYear = 0;
        long maxDistance = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();

            long distance = calculateDistance(day, month, year);

            if (distance > maxDistance) {
                maxDistance = distance;
                maxDay = day;
                maxMonth = month;
                maxYear = year;
            }
        }
        System.out.println(maxDay + " " + maxMonth + " " + maxYear);
        sc.close();
    }

    private static long calculateDistance(int day, int month, int year) {
        long totalDays = day + (month - 1) * 30 + (year - 1) * 365;
        return totalDays;
    }
}
