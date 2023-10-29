package Lecture16_Final;

import java.util.Scanner;

public class Crossroads {
    public static int left(int x) {
        int re = (x - 1) % 4;
        if (re < 0)
            return 3;
        return re;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] sections = new int[4][];
        for (int i = 0; i < 4; ++i) {
            sections[i] = new int[4];
            for (int j = 0; j < 4; ++j)
                sections[i][j] = sc.nextInt();
        }

        boolean accident = false;
        for (int i = 0; i < 4; ++i) {
            if (sections[i][3] == 1) {
                int sum = 0;
                for (int j = 0; j < 4; j++) {
                    sum += sections[i][j];
                }
                if (sections[(i + 1) % 4][0] == 1 || sections[(i + 2) % 4][1] == 1 || sections[left(i)][2] == 1 || sum > 1) {
                    accident = true;
                    break;
                }
            }
        }
        if (accident) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
            sc.close();
        }
    }
}
