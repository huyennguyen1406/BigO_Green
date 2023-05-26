package Lecture03_LoopStatement;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        num = sc.nextInt();
        for(int i = 1; i <= num; ++i){
            sum += i;
        }
        System.out.print(sum);
    }
}
