package Lecture10_DataAbstraction;

import java.util.Scanner;

public class AreaOfTheTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TriangleArray triangles = new TriangleArray();
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();

            Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);
            triangles.addTriangle(triangle);
        }

        double totalArea = triangles.getTotalArea();
        System.out.printf("%.2f", totalArea);
        sc.close();
    }

}

class Triangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public double getArea() {
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
class TriangleArray {
    private Triangle[] triangles;
    private int size = 0;

    public TriangleArray() {
        triangles = new Triangle[50];
        size = 0;
    }
    public void addTriangle(Triangle triangle) {
        triangles[size] = triangle;
        size++;
    }

    public double getTotalArea() {
        double totalArea = 0.0;
        for (int i = 0; i < size; i++) {
            totalArea += triangles[i].getArea();
        }
        return totalArea;
    }
}
