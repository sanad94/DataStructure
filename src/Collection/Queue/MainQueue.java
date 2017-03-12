package Collection.Queue;
import Collection.LinkedList.LinkedList;
import Collection.ArrayList.ArrayList;

/**
 * Created by 2017 on 02/01/2017.
 */
public class MainQueue
{
    public static void main(String[] args)
    {
      Queue<Integer> queueLinkedList = new Queue<Integer>(new LinkedList<Integer>());
      queueLinkedList.add(0);
      queueLinkedList.add(1);
        System.out.println("queueLinkedList");
        System.out.println(queueLinkedList.poll());
        System.out.println(queueLinkedList.peek());
        System.out.println(queueLinkedList.size());
        Queue<Integer> queueArrayList = new Queue<Integer>(new ArrayList<Integer>());
        queueArrayList.add(2);
        queueArrayList.add(3);
        System.out.println("queueArrayList");
        System.out.println(queueArrayList.poll());
        System.out.println(queueArrayList.peek());
        System.out.println(queueArrayList.size());
    }
}
