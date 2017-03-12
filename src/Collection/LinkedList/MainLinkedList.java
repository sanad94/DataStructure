package Collection.LinkedList;

/**
 * Created by 2017 on 31/12/2016.
 */
public class MainLinkedList
{
    public static void main(String[] args)
    {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(10);
        linkedList.add(11);
        linkedList.delete(0);
        System.out.println(linkedList.get(0));


       // System.out.println(linkedList.size());
     //   linkedList.delete(0);
      //  System.out.println(linkedList.isEmpty());


       linkedList.dis();

    }
}
