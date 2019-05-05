package com.company;
public class SelectionSort
{
    public static void selectionSort(int[] arr)
    {
        //outer loop controlling the index position
        for (int i = 0; i < arr.length - 1; i++)
        {
            //tying index to outer loop
            int index = i;
            //loop ranking current index against current min
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[index])
                {
                    //new min
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            //sorting index into lowest available position
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}
//hello coder