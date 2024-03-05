package org.example;

public class ReverseArrayUsingExtraArray {
    public static void reverseArrayUsingArray() {
        int[] array = {45, 78, 23, 55, 77};
        int[] reversedArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }
        System.out.print("Reversed Array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }

}

