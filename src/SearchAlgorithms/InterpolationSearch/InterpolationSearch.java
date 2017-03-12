package SearchAlgorithms.InterpolationSearch;

import Collection.ArrayList.ArrayList;

/**
 * Created by 2017 on 05/01/2017.
 */
public class InterpolationSearch<T extends Comparable>
{
    private ArrayList<T> arrayList ;
    private int numberOfTry;

    InterpolationSearch(ArrayList<T> arrayList)
    {
        this.arrayList =arrayList;
        this.numberOfTry=0;


    }

    public int getNumberOfTry()
    {
        return numberOfTry;
    }
    public boolean search(T item)
    {
        int high = arrayList.lastIndex();
        int low = arrayList.firstIndex();
        int mid = 0 ;
        boolean isFound = false;
        while (!isFound)
        {
            int Ahig=(Integer) arrayList.get(high);
            int Alow=(Integer) arrayList.get(low);
            mid = low +((high-low)/(Ahig-Alow)*((Integer) item-Alow));
            numberOfTry++;
            if(low>high)
            {
                isFound=false;
                break;
            }
            if( arrayList.get(mid).compareTo(item)==0)
            {
                isFound=true;
                break;
            }
            if (arrayList.get(mid).compareTo(mid)>0)
            {
                high=mid-1;
            }
            if (arrayList.get(mid).compareTo(mid)<0)
            {
                low=mid+1;
            }

        }
        return isFound;
    }

}
