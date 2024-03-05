package org.example;

public class ArrayPaallindrom {
    public static int arrayPallindrom()
    {
        int[] a = {11,45,67,89,90};
        int sum =0;
         for(int i =0;i< a.length;i++)
         {
             int temp = a[i];
             while (temp>0) {
                 int r = temp % 10;
                 temp = temp / 10;
                 sum = sum * 10 + r;
             }
             if(sum != a[i]) {
               return 0;
             }

         }
        return 1;
    }}


