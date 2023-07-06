package Lecture10_DataAbstraction;

import java.util.Scanner;

public class OldestEmployee {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Employee employees[] = new Employee[n];

        for (int i = 0; i < n; i++) {
            String id = sc.next();
            String name = sc.next();
            int year = sc.nextInt();
            employees[i] = new Employee(id, name, year);
        }

        Employee ans = employees[0];
        for (int i = 1; i < n; i++) {
            if (employees[i].year < ans.year || (employees[i].year == ans.year && employees[i].id.compareTo(ans.id) < 0)) {
                ans = employees[i];
            }
        }

        System.out.println(ans.id + ' ' + ans.name + ' ' + ans.year);
        sc.close();
    }
}

class Employee {
    String id;
    String name;
    int year;

    Employee(String id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }
}
