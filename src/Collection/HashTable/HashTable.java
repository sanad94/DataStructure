package Collection.HashTable;

import Collection.ArrayList.ArrayList;
import Collection.LinkedList.LinkedList;
import Collection.VectorInterface.Vector;


public class HashTable <V>
{
    private class Node<V>
    {
        private Vector<V> linkedListValye=new LinkedList<V>();

        Node()
        {

        }
    }
    private Vector<Node> arrayListKey ;
    HashTable()
    {
        arrayListKey = new ArrayList<Node>();

    }
    public void put(int key,V value)
    {
        Node item =  arrayListKey.get(key);
        if(item!=null)
        {

                Node node = new Node();
                node = arrayListKey.get(key);
                node.linkedListValye.add(value);

        }
        else
        {
            Node node = new Node();
            node.linkedListValye.add(value);
            arrayListKey.add(node);
        }
    }
    public V get(int key)
    {
       Node item =  arrayListKey.get(key);
       return (V )item.linkedListValye.firstOrDefault();
    }
    public V get(int key,int index)
    {
        Node item =  arrayListKey.get(key);
        return (V )item.linkedListValye.get(index);
    }
    public void remove(int key)
    {
        arrayListKey.delete(key);
    }
    public void remove(int key,int index)
    {
        Node item =  arrayListKey.get(key);
        item.linkedListValye.delete(index);
    }
    public int size()
    {
        return arrayListKey.size();
    }
    public boolean isEmpty()
    {
      return  arrayListKey.isEmpty();
    }
}
