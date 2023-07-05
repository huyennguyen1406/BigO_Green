package Lecture10_DataAbstraction;

import java.util.Scanner;

public class ExcellentStudent {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Classroom classroom = new Classroom();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            name = sc.nextLine();
            double math = sc.nextDouble();
            double literature = sc.nextDouble();

            Student student = new Student(name, math, literature);
            classroom.addStudent(student);
        }
        int count = classroom.countStudentsWithGPA(9.0);
        System.out.println(count);
        sc.close();
    }
}

class Student {
    private String name;
    private double math;
    private double literature;

    public Student(String name, double math, double literature) {
        this.name = name;
        this.math = math;
        this.literature = literature;
    }
    public double getGPA() {
        return(math + literature) / 2;
    }
}

class Classroom {
    private Student[] students;
    private int size;

    public Classroom() {
        students = new Student[100];
        size = 0;
    }

    public void addStudent (Student student) {
        students[size] = student;
        size++;
    }

    public int countStudentsWithGPA(double score) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (students[i].getGPA() >= score) {
                count++;
            }
        }
        return count;
    }
}
