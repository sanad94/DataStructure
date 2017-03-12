package SearchAlgorithms.LinearSearch;

import Collection.ArrayList.ArrayList;

/**
 * Created by 2017 on 03/01/2017.
 */
public class MainLinearSearch
{
    public static void main(String[] args)
    {

        //i use my self implementation ArrayList class
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0 ; i<100 ; i++)
        {
            arrayList.add(i);
        }
        LinearSearch<Integer> linearSearch = new LinearSearch<>(arrayList);
        boolean isfound = linearSearch.search(99);
        System.out.println(isfound);
        // its tell you how many time tried to get the element
        System.out.println(linearSearch.getNumberOfTry());
    }
}
