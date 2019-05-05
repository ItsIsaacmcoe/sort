package com.company;
public class SelectionSort
{
    public static void selectionSort(int[] arr)
    {
        //outer loop controlling the index position
        for (int index_position = 0; index_position < arr.length - 1; index_position++)
        {
            //tying index to outer loop
            int index = index_position;
            //loop ranking current index against current min
            for (int j = index_position + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[index])
                {
                    //new min
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            //sorting index into lowest available position
            arr[index] = arr[index_position];
            arr[index_position] = smallerNumber;
        }
    }
}
//hello coder