package Lecture10_DataAbstraction;

import java.util.Scanner;

public class BuyingApples {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Apple a[] = new Apple[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Apple(sc.nextInt(), sc.nextInt());
        }

        int index = 0;
        for (int i = 1; i < n; i++) {
            if (a[index].w < a[i].w || (a[index].w == a[i].w && a[index].p < a[i].p)) {
                index = i;
            }
        }

        System.out.println(index);
        sc.close();
    }
}

class Apple {
    int w;
    int p;
    Apple(int w, int p) {
        this.w = w;
        this.p = p;
    }
}
