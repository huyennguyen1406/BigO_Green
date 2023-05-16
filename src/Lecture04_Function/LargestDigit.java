package Lecture04_Function;

import java.util.Scanner;

public class LargestDigit {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập số nguyên dương N
            int N = scanner.nextInt();

            // Khởi tạo biến max_digit là chữ số lớn nhất ban đầu
            int max_digit = 0;

            // Lặp qua từng chữ số của N
            while (N > 0) {
                int digit = N % 10;  // Lấy chữ số cuối cùng của N
                N /= 10;  // Loại bỏ chữ số cuối cùng của N

                // Nếu chữ số hiện tại lớn hơn chữ số lớn nhất hiện tại,
                // cập nhật giá trị của max_digit
                if (digit > max_digit) {
                    max_digit = digit;
                }
            }

            // In ra chữ số lớn nhất của N
            System.out.println(max_digit);

            scanner.close();
        }
}
