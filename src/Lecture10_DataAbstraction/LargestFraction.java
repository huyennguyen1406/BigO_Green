package Lecture10_DataAbstraction;

import java.util.Scanner;

class Fract {
    int nu;
    int de;

    Fract(int nu, int de) {
        this.nu = nu;
        this.de = de;
    }

    int gcd(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public void reduce() {
        int c = gcd(nu, de);
        nu /= c;
        de /= c;
    }
}

public class LargestFraction {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Fract a[] = new Fract[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Fract(sc.nextInt(), sc.nextInt());
        }

        Fract ans = a[0];
        for (int i = 1; i < n; i++) {
            if (ans.nu * a[i].de < a[i].nu * ans.de) {
                ans = a[i];
            }
        }

        ans.reduce();
        System.out.println(ans.nu + " " + ans.de);
        sc.close();
    }
}
