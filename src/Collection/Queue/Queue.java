package Collection.Queue;
import Collection.VectorInterface.Vector;

public class Queue<T>
{
    // i use My Collection.ArrayList not Collection.ArrayList in java
    //private Collection.ArrayList<T> Collection.Queue ;

    private Vector<T> Queue;

    public Queue(Vector<T> Queue)
    {
        this.Queue = Queue;
    }
    public void add(T item)
    {

        Queue.add(item);


    }
    public T poll()
    {
        T item = (T) Queue.get(Queue.firstIndex());
        Queue.delete(Queue.firstIndex());
        return item;

    }
    public T peek()
    {
        T item = (T) Queue.get(Queue.firstIndex());
        return item;
    }

    public boolean isEmpty()
    {
        return Queue.isEmpty();
    }

    public int size()
    {
        return Queue.size();
    }

    public void replace(int index , T item)
    {
        Queue.replace(index,item);
    }
    public void add(int index ,T item)
    {
        Queue.add(index,item);
    }

    public void delete (int index )
    {
        Queue.delete(index);
    }

}
