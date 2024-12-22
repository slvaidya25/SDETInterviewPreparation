package org.sdet.javaPrograms;

import java.util.Arrays;

public class IndexOfSubArrayWithSum {
    public static void main(String[] args){
        int[] numberArray = {1, 0, 3, 4, 5, 0, 7, 8,9, 10};
        int sum = 15;
        System.out.println(Arrays.toString(findSubArray(numberArray, sum)));
    }

    public static int[] findSubArray(int[] numberArray, int sum){
        int[] subArrayIndexes = new int[2];
        int startIndex = 0;
        int tempSum = 0;
        for (int i = 0; i<numberArray.length; i++) {
            tempSum += numberArray[i];
            if (tempSum == sum) {
                subArrayIndexes[0] = startIndex;
                subArrayIndexes[1] = i;
                break;
            } else if ((tempSum > sum) && (startIndex < numberArray.length)) {
                tempSum = 0;
                i = startIndex++;
            }
        }

        return subArrayIndexes;
    }
}
