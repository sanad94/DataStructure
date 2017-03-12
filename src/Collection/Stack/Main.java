package Collection.Stack;

import Collection.ArrayList.ArrayList;
import Collection.LinkedList.LinkedList;


/**
 * Created by 2017 on 01/01/2017.
 */
public class Main
{
    public static void main(String[] args)
    {


       Stack<Integer> stackLinkedList = new Stack<Integer>(new LinkedList<Integer>());
        stackLinkedList.push(5);
        stackLinkedList.push(6);
        stackLinkedList.push(7);
        System.out.println(stackLinkedList.pop());
       System.out.println(stackLinkedList.pop());
       System.out.println(stackLinkedList.pop());
        Stack<Integer> stackArrayList = new Stack<Integer>(new ArrayList<Integer>());
        stackArrayList.push(5);
        stackArrayList.push(6);
        stackArrayList.push(7);
        System.out.println(stackArrayList.pop());
        System.out.println(stackArrayList.pop());
        System.out.println(stackArrayList.pop());








    }
}

