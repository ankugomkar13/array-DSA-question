package org.example;

public class LargstElement {
    public static void main(String args[])
    {
        int arr[] ={12,34,56,23,11,3};
        int largest = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }
        }
        //largest number
        System.out.println(largest);
    }
}
