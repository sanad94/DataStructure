package SearchAlgorithms.InterpolationSearch;

import Collection.ArrayList.ArrayList;


/**
 * Created by 2017 on 05/01/2017.
 */
public class MainInterpolationSearch
{
    public static void main(String[] args)
    {
        //i use my self implementation ArrayList class
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0 ; i<100 ; i++)
        {
            arrayList.add(i);

        }

        InterpolationSearch<Integer> interpolationSearch = new InterpolationSearch<>(arrayList);
        boolean isfound = interpolationSearch.search(99);
        System.out.println(isfound);
        // its tell you how many time tried to get the element
        System.out.println(interpolationSearch.getNumberOfTry());
        //in the linyar search tried 99 time until find the element
        //in the binary search tried 6 time until find the element
        //in the interpolation search tried 1 time until find the element

    }
}
