package Lecture04_Function;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương N
        int N = scanner.nextInt();

        // Chuyển N thành chuỗi
        String N_str = Integer.toString(N);

        // Đếm số lượng ký tự trong chuỗi N_str
        int num_digits = N_str.length();

        // In ra số lượng chữ số của N
        System.out.println(num_digits);

        scanner.close();
    }
}
