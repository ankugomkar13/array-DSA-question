package org.example;

public class Secondlargestno {
    public static void main(String args[]) {
        int secondlargest = -1;
        int arr[] ={12,34,56,23,11,3};
        int largest = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }
        }
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>secondlargest && arr[i]!=largest)
            {
                secondlargest = arr[i];
            }
        }
        System.out.println(secondlargest);
    }
}
