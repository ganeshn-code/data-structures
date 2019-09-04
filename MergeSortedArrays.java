package com.ganesh.arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public int[] mergeSortedArrays(int[] array1, int[] array2) {
        int sortedArrayLength = array1.length + array2.length;
        int[] soretedArray = new int[sortedArrayLength];
        int array1Tracker = 0;
        int array2Tracker = 0;
        for (int i = 0; i < sortedArrayLength; i++) {
            if (array2Tracker > (array2.length - 1) || (array1Tracker < (array1.length) && array1[array1Tracker] < array2[array2Tracker])) {
                // Add element from array1
                soretedArray[i] = array1[array1Tracker];
                array1Tracker++;
            } else {
                // Add elelment from array2
                soretedArray[i] = array2[array2Tracker];
                array2Tracker++;
            }
        }
        return soretedArray;
    }

    public static void main(String[] args) {
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();
        int[] array2 = {1, 2, 7, 12, 52};
        int[] array1 = {};
        final int[] sortedArray = mergeSortedArrays.mergeSortedArrays(array1, array2);
        System.out.println(Arrays.toString(sortedArray));
    }
}
