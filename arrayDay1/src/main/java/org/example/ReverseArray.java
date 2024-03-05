package org.example;

public class ReverseArray {
    public static void reverseArray()
    {
        int[] a = {2,4,6,3,2,1};
        System.out.println("\nReverse Array");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }

    }
}
