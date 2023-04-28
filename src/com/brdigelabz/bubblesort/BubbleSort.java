package com.brdigelabz.bubblesort;

import java.util.ArrayList;

public class BubbleSort {
    public static void main(String[] args) {

      int[] arr1  = {6,3,0,5};

        System.out.println(arr1.length);

        for (int i = 1 ; i<arr1.length ; i++)
        {
             for (int j=i+1 ; j<arr1.length;j++)
             {
                 if (arr1[i] > arr1[j])
                 {
                      int temp = arr1[i];
                      arr1[i] = arr1[j];
                      arr1[j] = temp;

                 }
             }
            for (int a = 0; a < arr1.length; a++)
            {
                System.out.println(arr1[i]);
            }
        }
    }

}
