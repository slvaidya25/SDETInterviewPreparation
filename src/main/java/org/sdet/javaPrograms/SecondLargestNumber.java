package org.sdet.javaPrograms;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args){
        int[] numberArray = {1, 0, 2, 3, 4, 3, 2, 7, 8, 56};
        System.out.println(findSecondLargest(numberArray));
    }

    static int findSecondLargest(int[] numberArray){
        int secondLargest = 0;
        int largest = 0;
        for (int number : numberArray) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }

        return secondLargest;
    }
}
