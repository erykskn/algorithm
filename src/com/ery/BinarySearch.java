package com.ery;

public class BinarySearch {
    private static final int[] ARRAY = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void search(int number) {
        find(number, 0, ARRAY.length);
    }

    private static void find(int number, int firstIndex, int lastIndex) {
        int middle = (firstIndex + lastIndex) / 2;

        if ((middle < firstIndex || middle >= lastIndex)) {
            System.out.println("Not founded number: " + number);
            System.exit(1);
        }
        if (ARRAY[middle] == number) {
            System.out.println("Index of number in array: " + middle);
            System.exit(1);
        }

        if (number < ARRAY[middle]) {
            find(number, firstIndex, middle - 1);
        } else {
            find(number, middle + 1, lastIndex);
        }

    }
}
