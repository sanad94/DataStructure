package Collection.HashTable;

/**
 * Created by 2017 on 03/01/2017.
 */
public class MainHashTable
{
    public static void main(String[] args)
    {
        HashTable<Integer> hashTable = new HashTable<Integer>();
        /*
        my hashtable allow you to provide multiple value to the same key
        but the key start from 0 and increased by 1 such as the example.
        * if you try to start key greater or less than 0 it will return you error out of index
        * if you try to increased sequence of the key greater than 1  it will return you error out of index
        * */
        //correct way to put data with key
        hashTable.put(0,10);
        hashTable.put(0,11);
        hashTable.put(1,10);
        hashTable.put(1,20);
        //it will retrieve the first element in key 0
        //output : 10
        System.out.println(hashTable.get(0));
        //another feature in my hashtable it allow you to retrive any
        // elemnet by index in the same key
        //it will retrieve the element by index 1 in key 1
        //output : 20
        System.out.println(hashTable.get(1,1));
        // remove specific element in the key by its index
        hashTable.remove(0,1);
        // remove the key and all the element of them
       hashTable.remove(0);
       //retrieve the size of hash table
        hashTable.size();
        // retrieve true  if the hashtable is empty else false
        hashTable.isEmpty();


        // respectfully
        // sanad haj yahya
        //software engineer



    }
}
