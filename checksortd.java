package org.example;

public class checksortd {
    public static void main(String args[])
    {
        int arr[] ={23,56,78,12,11};
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]>=arr[i-1])
            {
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}
