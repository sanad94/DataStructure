package SortAlgorithms.MergeSort;

public class MergeSort
{
    private int [] array ;
    private int [] temparray ;
    public void sort(int [] arrry)
    {
        this.array=arrry;
        this.temparray=new int [arrry.length];
        doMerge(0,arrry.length-1);
    }

    private void doMerge(int lowIndex, int highIndex)
    {
        if(lowIndex<highIndex)
        {
            int middle = lowIndex + (highIndex-lowIndex)/2;
            doMerge(lowIndex,middle);
            doMerge(middle+1,highIndex);
            mergePart(lowIndex,middle,highIndex);
        }
    }

    private void mergePart(int lowIndex, int middle, int highIndex)
    {
        for (int i = lowIndex; i<=highIndex ; i++)
        {
         temparray[i]=array[i];
        }
        int a = lowIndex ;
        int b = middle +1 ;
        int c = lowIndex ;
        while(a<=middle && b<=highIndex)
        {
            if(temparray[a]<=temparray[b])
            {
                array[c] = temparray[a] ;
                a++;
            }
            else
            {
                array[c] = temparray[b];
                b++ ;
            }
            c++ ;
        }

        while (a<=middle)
        {
            array[c] = temparray[a] ;
            a++;
            c++;
        }
    }
    public int [] sortedArray()
    {
        return array;
    }
}