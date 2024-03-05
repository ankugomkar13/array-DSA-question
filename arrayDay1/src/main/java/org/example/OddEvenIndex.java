package org.example;

public class OddEvenIndex {
    public static void oddEvenIndex()
    {
        int[] array = {23,56,78,2,4,6};
        for(int i=0;i< array.length;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even Index :"+i);
            }
            else {
                System.out.println("Odd Index :"+i);
            }
        }
    }
}
