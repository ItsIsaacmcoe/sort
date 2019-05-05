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
            for (int ordinal = index_position + 1; ordinal < arr.length; ordinal++)
            {
                //TODO: understand this in your head
                if (arr[ordinal] < arr[index])
                //START
                {
                    //new min
                    index = ordinal;
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