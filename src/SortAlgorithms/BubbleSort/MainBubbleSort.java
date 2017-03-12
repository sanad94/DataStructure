package SortAlgorithms.BubbleSort;

import Collection.ArrayList.ArrayList;

/**
 * Created by 2017 on 19/01/2017.
 */
public class MainBubbleSort
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(30);
        arrayList.add(50);
        arrayList.add(10);
        arrayList.add(40);
        arrayList.add(20);
        System.out.println("befor sort");
        for (int i = 0; i <arrayList.size()-1 ; i++)
        {
            System.out.print(arrayList.get(i)+"   ");
        }
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        arrayList=bubbleSort.Sort(arrayList);
        System.out.println("after sort");
        for (int i = 0; i <arrayList.size()-1 ; i++)
        {
            System.out.print(arrayList.get(i)+"   ");
        }
    }


}
