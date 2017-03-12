package Collection.Stack;
import Collection.VectorInterface.Vector;

public class Stack<T>
{
    // i use My Collection.ArrayList not Collection.ArrayList in java
  //private Collection.ArrayList<T> stack ;

    private Vector<T> stack;

    public Stack(Vector<T> stack)
    {
        this.stack=stack;
    }
    public void push(T item)
    {

       stack.add(item);


    }
    public T pop()
    {
        T item = (T) stack.get(stack.lastIndex());
        stack.delete(stack.lastIndex());
        return item;

    }
    public T peek()
    {
        T item = (T) stack.get(stack.lastIndex());
        return item;
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public int size()
    {
        return stack.size();
    }

    public void replace(int index , T item)
    {
        stack.replace(index,item);
    }
    public void add(int index ,T item)
    {
        stack.add(index,item);
    }

    public void delete (int index )
    {
        stack.delete(index);
    }

}
