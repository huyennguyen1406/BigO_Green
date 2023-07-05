package Lecture10_DataAbstraction;

import java.util.Scanner;

public class SearchingStudents {
    public String id, math, lit;

    public SearchingStudents(String c, String a, String b) {
        math = a;
        lit = b;
        id = c;
    }
}

class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        SearchingStudents []students = new SearchingStudents[n];
        for(int i=0; i<n; ++i){
            String id = sc.next(), math = sc.next(), lit = sc.next();
            students[i] = new SearchingStudents(id, math, lit);
        }
        String id;
        for(int i=0; i<q; ++i){
            id = sc.next();
            for(int j=0; j<n; ++j){
                if(students[j].id.compareTo(id) == 0){
                    System.out.printf("%s %s\n", students[j].math, students[j].lit);
                    break;
                }
            }
        }
        sc.close();
    }
}
