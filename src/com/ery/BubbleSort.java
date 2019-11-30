package com.ery;

public class BubbleSort {

    public static int[] sort(int[] unSortedArr) {

        for (int a = 0; a < unSortedArr.length; a++) {
            for (int b = 0; b < unSortedArr.length; b++) {
                if (unSortedArr[b] > unSortedArr[a]) {
                    int temp = unSortedArr[a];
                    unSortedArr[a] = unSortedArr[b];
                    unSortedArr[b] = temp;
                }
            }
        }

        return unSortedArr;
    }

}
