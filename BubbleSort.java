package org.example;

public class BubbleSort {

    public static void sortedArray(int arrs[])
    {
        for(int i=0;i<arrs.length;i++)
        {
            System.out.print(arrs[i] + " ");
        }
    }
    public static void main(String args[])
    {
        int arrs[] ={7,8,3,21,2};

        for (int i = 0; i < arrs.length - 1; i++) {
            for (int j = 0; j < arrs.length - i - 1; j++) {
                if (arrs[j] > arrs[j + 1]) {
                    int temp = arrs[j];
                    arrs[j] = arrs[j + 1];
                    arrs[j + 1] = temp;
                }
            }
        }
        sortedArray(arrs);

    }
}
