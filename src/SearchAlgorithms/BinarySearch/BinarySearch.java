package SearchAlgorithms.BinarySearch;

import Collection.ArrayList.ArrayList;

/**
 * Created by 2017 on 03/01/2017.
 */
public class BinarySearch<T extends Comparable>
{
    private ArrayList<T> arrayList;
    private int numberOfTry;
    BinarySearch(ArrayList<T> arrayList)
    {
        this.arrayList=arrayList;
        numberOfTry=0;
    }

    public boolean search(T  item)
    {
        boolean isFound = false;
        int low = arrayList.firstIndex();
        int high = arrayList.lastIndex();
        int mid=0;

        while (!isFound)
        {
           mid  = (low + high) / 2;
            if (low > high)
            {
                break;
            }
            if (arrayList.get(mid).compareTo(item) > 0)
            {
                high=mid-1;
            }
            if (arrayList.get(mid).compareTo(item) < 0)
            {
                low=mid+1;
            }
            if(arrayList.get(mid).compareTo(item)==0)
            {
                isFound=true;
                break;
            }

            numberOfTry++;
        }
           return isFound;
    }

    public int getNumberOfTry()
    {
        return numberOfTry;
    }
}
