package Lecture08_Midterm;

import java.util.*;

public class ChristmasTree
{
    public static void main(String[] args)
    {
        // n = 3
        //   *
        //  * *
        // * * *
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int width = n * 2 - 1;
        char[][] tree = new char[n][width];
        int nSpace = 0; // so khoang trang phai in tai moi dong
        for (int i = n - 1; i >= 0; --i)
        {
            char[] row = new char[width]; // ki tu tai moi dong
            int ind = 0;
            for (int space = 0; space < nSpace / 2; ++space)
            {
                row[ind] = ' ';
                ++ind;
            }
            for (int star = 0; star < width - nSpace; ++star)
            {
                row[ind] = '*';
                ++ind;
            }
            for (int space = 0; space < nSpace / 2; ++space)
            {
                row[ind] = ' ';
                ++ind;
            }
            tree[i] = row;
            nSpace += 2;
        }
        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < tree[i].length; ++j)
            {
                System.out.print(tree[i][j]);
            }
            System.out.println();

        }
        sc.close();
    }
}