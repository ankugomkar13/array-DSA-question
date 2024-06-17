package org.example;

public class SelectionSort {
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
            int smallest = i;
            for (int j = i+1 ; j < arrs.length; j++) {
                if (arrs[smallest] > arrs[j]) {
                    smallest = j;
                }
                int temp = arrs[smallest];
                arrs[smallest] = arrs[i];
                arrs[i] = temp;
            }
        }
        sortedArray(arrs);

    }
}
