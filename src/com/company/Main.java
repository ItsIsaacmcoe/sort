package com.company;
public class Main
{

    public static void main(String[] args)
    {
	    int[] list = {4,6,1,4,8};
        SelectionSort.selectionSort(list);
        for(int i=0; i < list.length; i++)
            System.out.print(list[i]);
        MergeSort.merge();
    }
}

