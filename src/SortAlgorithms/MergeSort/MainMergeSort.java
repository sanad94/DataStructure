package SortAlgorithms.MergeSort;

import Collection.ArrayList.ArrayList;

/**
 * Created by 2017 on 19/01/2017.
 */
public class MainMergeSort
{
    public static void main(String[] args)
    {
        int [] array = new int [4];
        array[0]=4;
        array[1]=1;
        array[2]=3;
        array[3]=2;
        MergeSort mergeSort = new MergeSort() ;
        mergeSort.sort(array);
        array=mergeSort.sortedArray();
        System.out.println("sorted array ");
        for (int i = 0; i <array.length ; i++)
        {
            System.out.println(array[i] + "  ");
        }

    }
}
