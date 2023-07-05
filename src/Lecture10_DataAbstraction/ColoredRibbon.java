package Lecture10_DataAbstraction;

import java.util.Scanner;

public class ColoredRibbon {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        Color colors[] = new Color[1001];
        for (int i = 1; i <= 1000; i++) colors[i] = new Color();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int l = sc.nextInt();
            colors[p].update(l);
        }

        int differentColors = 0;
        for (int i = 1; i <= 1000; i++) {
            if (colors[i].cnt > 0) {
                differentColors++;
            }
        }

        System.out.println(differentColors);
        for (int i = 1; i <= 1000; i++) {
            if (colors[i].cnt > 0) {
                System.out.println(i + " " + colors[i].sumLen + " " + colors[i].cnt);
                sc.close();
            }
        }
    }
}
class Color {
    int sumLen;
    int cnt;
    Color() {
        sumLen = 0;
        cnt = 0;
    }
    public void update(int newLen) {
        cnt += 1;
        sumLen += newLen;
    }
}
