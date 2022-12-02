package main;

import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] a = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = r.nextInt(20);
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }

        int min = 0;
        boolean find = true;
        for (int i = 0; i < a.length; i++) {
            int temp = a[i][a.length - i - 1];
            if (find) {
                min = temp;
                find = false;
            } else if (temp < min) {
                min = temp;
            }
        }
        System.out.println(find ? "Nothing" : min);


    }
}
