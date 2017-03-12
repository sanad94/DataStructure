package Collection.VectorInterface;

/**
 * Created by 2017 on 01/01/2017.
 */
public interface Vector<T>
{
 boolean isEmpty();
 int size();
 T get(int index);
 T firstOrDefault();
 void replace(int index , T item);
 void add(T item);
 void add(int index , T item);
 void delete(int index);
 int lastIndex();
 int firstIndex();
}
