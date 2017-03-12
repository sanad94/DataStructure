package SearchAlgorithms.LinearSearch;

import Collection.ArrayList.ArrayList;

/**
 * Created by 2017 on 03/01/2017.
 */
public class LinearSearch<T>
{
    private ArrayList<T> arrayList;
    private int numberOfTry;
    LinearSearch(ArrayList<T> arrayList)
    {
        this.arrayList=arrayList;
        numberOfTry=0;
    }

    public boolean search(T item)
    {
        boolean isFound = false;
        for (int i = 0 ; i<arrayList.size()-1 ;i++)
        {
            T num = arrayList.get(i);
            if(item==num)
            {
               isFound=true;
               break;
            }
            numberOfTry ++;
        }
        return isFound;
    }

    public int getNumberOfTry()
    {
        return numberOfTry;
    }
}
