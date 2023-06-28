package Lecture09_Recursion;

import java.util.Scanner;

public class HexadecimalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String hexaNumber = decimalToHexa(number);
        System.out.println(hexaNumber);
        sc.close();
    }

    public static String decimalToHexa (int decimal) {
        if (decimal < 16) {
            return convert(decimal);
        } else {
            int remainder = decimal % 16;
            int quotient = decimal / 16;
            String quotientInHexa = decimalToHexa(quotient);
            String remainderInHexa = convert(remainder);
            return quotientInHexa + remainderInHexa;
        }
    }

    public static String convert (int digit) {
        if (digit < 10) {
            return Integer.toString(digit);
        } else {
            char hexDigit = (char) ('A' + (digit - 10));
            return Character.toString(hexDigit);
        }
    }
}
