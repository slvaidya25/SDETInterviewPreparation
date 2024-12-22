package org.sdet.javaPrograms;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 20, b = 30;
        a = (a + b) - (b = a);
        System.out.println(a + ", " + b);
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println(a + ", " + b);
    }
}
