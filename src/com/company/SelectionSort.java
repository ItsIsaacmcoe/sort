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
            for (int ordinal = i + 1; ordinal < arr.length; ordinal++)
            {
                if (arr[ordinal] < arr[index])
                {
                    //new min
                    index = ordinal;
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