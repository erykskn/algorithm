package com.ery;

public class Fibonacci {
    private static int preNumber = 0;
    private static int number = 1;
    private static int tmp = 1;

    public static void writeFibonacci(int count) {
        if (count > 0) {
            System.out.print(number + "-");
            tmp = number;
            number = number + preNumber;
            preNumber = tmp;
            count--;
            writeFibonacci(count);
        }
    }

}
