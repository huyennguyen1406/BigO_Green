package Lecture10_DataAbstraction;

import java.util.Scanner;

public class SumOfFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction f1 = new Fraction(sc.nextInt(), sc.nextInt());
        Fraction f2 = new Fraction(sc.nextInt(), sc.nextInt());
        Fraction sum = f1.add(f2).reduce();
        System.out.println(sum.getNumerator() + " " + sum.getDenominator());
        sc.close();
    }
}

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction add(Fraction other) {
        int lcm = denominator * other.denominator / gcd(denominator, other.denominator);
        int num = numerator * (lcm / denominator) + other.numerator * (lcm / other.denominator);
        return new Fraction(num, lcm);
    }

    public Fraction reduce() {
        int commonFactor = gcd(numerator, denominator);
        return new Fraction(numerator / commonFactor, denominator / commonFactor);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
