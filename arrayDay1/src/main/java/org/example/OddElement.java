package org.example;

public class OddElement {
    public static void oddElement(){
        int[] array = {34,7,8,4,3,6,9};
        System.out.println("\nOdd Array :");
        for(int i=0;i< array.length;i++)
        {
            if(array[i]%2!=0)
            {
                System.out.print(array[i]+" ");
            }
        }
}}
