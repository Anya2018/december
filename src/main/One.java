package main;

import java.io.IOException;

public class One {
    public static void main(String[] args) throws IOException {
        fun3();
    }

    public static void fun3() {
        int a = 3;
        int b;
        int c;
        b = a++;
        c = ++a;
        System.out.println(a + "_" + b + "_" + c);
    }

}
