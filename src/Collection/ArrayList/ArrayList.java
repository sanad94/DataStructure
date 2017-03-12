package Collection.ArrayList;

import Collection.VectorInterface.Vector;

import java.util.Arrays;

public class ArrayList<T> implements Vector<T>
{
    private Object [] array ;
    private int size ;
    private int index;

    @Override
    public T firstOrDefault()
    {
    return (T)array[0];
    }

    public ArrayList()
    {
        this.size = 2;
        this.index = -1;
        this.array = new Object[this.size];
    }
    public ArrayList(int size)
    {
        this.size = size;
        this.index = -1;
        this.array = new Object[this.size];
    }
    private void capacity(int minSize)
    {
        int oldSize = array.length;
        int newSize = oldSize*2;
        if(minSize>oldSize)
        {
            array= Arrays.copyOf(array,newSize);
        }
    }
    public void add(T item)
    {
        this.index++;
      capacity(size++);
      array[this.index]=item;
    }
    public void add(int index , T item)
    {
        checkIndex(index);
        capacity(size++);
        Object temp = null;
        for (int i = array.length - 1; i > -1; i--)
        {
            if (i >= 1)
            {
                temp = array[i - 1];

            }
            array[i] = temp;
            if (i == index)
            {
                array[i] = item;
                break;
            }


        }
        this.index++;
    }


    public T get(int index )
    {
        checkEmpty();
        checkIndex(index);
        return (T)array[index];
    }
    public void delete(int index)
    {
        checkEmpty();
        checkIndex(index);
        for (int i = index; i < array.length; i++)
        {
            Object temp = null;
            if (i < array.length - 1) {
                temp = array[i + 1];

            }
            array[i] = temp;
        }
        this.index--;
        this.size--;

    }

    @Override
    public int lastIndex()
    {
        return this.index;
    }

    @Override
    public int firstIndex()
    {
        return 0;
    }

    public void replace(int index , T item)
    {
        checkIndex(index);
        array[index]=item;
    }
    private void checkEmpty()
    {
        if(!isEmpty())
        {
           return;
        }
        else
        {
            throw new NullPointerException("List Is Empty");
        }
    }
    private void checkIndex(int index)
    {
        if(index >-1&& index <size()-1)
        {
            return;
        }
        else
        {
            throw new IndexOutOfBoundsException("Out Of Index");
        }
    }
    public int size()
    {
        return array.length;
    }

    public boolean isEmpty()
    {
        return array.length==1 && array[0]==null;
    }
    public void dis()
    {
        for (int i=0 ; i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
