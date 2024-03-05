package org.example;

public class OddEvenElement {

    public static void elementSort()
    {
        int[] array = {34,67,2,3,56,90};
        for(int i =0;i< array.length;i++)
        {
            if(array[i]%2==0)
            {
                System.out.println("Even Element: ");
                System.out.println(array[i]+"");
            }
            else
            {
                System.out.println("odd Element : ");
                System.out.println(array[i]+"");
            }
        }
    }
}
