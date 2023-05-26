package Lecture05_Array;

import java.util.Scanner;

public class ListDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < num; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
