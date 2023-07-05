package Lecture10_DataAbstraction;

import java.util.Scanner;

public class Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Mx = sc.nextInt();
        int My = sc.nextInt();
        int N = sc.nextInt();

        double maxDistance = -1;
        Point maxPoint = null;

        Point M = new Point(Mx, My);

        for (int i = 0; i < N; i++) {
            int xi = sc.nextInt();
            int yi = sc.nextInt();
            Point NPoint = new Point(xi, yi);
            double distance = M.distanceTo(NPoint);
            if (distance > maxDistance) {
                maxDistance = distance;
                maxPoint = NPoint;
            }
        }

        System.out.println(maxPoint.getX() + " " + maxPoint.getY());
        sc.close();
    }
}
class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

