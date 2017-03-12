package SortAlgorithms.BubbleSort;

import Collection.ArrayList.ArrayList;

/**
 * Created by 2017 on 19/01/2017.
 */
public class BubbleSort<T extends Comparable>
{

    // bubble sort algorithm
    // time complexity o(n^2)
    public ArrayList<T> Sort(ArrayList<T> arrayList)
    {
       for (int i = 0 ; i<arrayList.size()-1;i++)
       {
           for (int j = 0; j <=i ; j++)
           {
               if(arrayList.get(i) !=null && arrayList.get(j)!=null)
               {
                   if (arrayList.get(i).compareTo(arrayList.get(j)) < 0)
                   {
                       T temp = arrayList.get(i);
                       arrayList.replace(i, arrayList.get(j));
                       arrayList.replace(j, temp);
                   }
               }
           }
       }

        return arrayList;
    }
}
