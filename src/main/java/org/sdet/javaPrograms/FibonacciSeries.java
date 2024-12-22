package org.sdet.javaPrograms;

public class FibonacciSeries {
    public static void main(String[] args) {
        int number = 10;
        for (int i=0; i< 20; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int number) {
        if (number < 2)
            return number;
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
