package Collection.LinkedList;

import Collection.VectorInterface.Vector;

public class LinkedList<T> implements Vector<T>
{
    private Node head ;
    private Node last;
    public void addfirst(T item)
    {
        Node newNode = new Node(item,null,null);
        newNode.setNext(head);
        head=newNode;
    }
    public void add(T item)
    {
        Node newNode = new Node(item,null,null);
        if(isEmpty())
        {
            head = newNode;
            last=head;
        }
        else
        {
            Node temp =last ;
            last.setNext(newNode);
            last = newNode;
            last.setPrevious(temp);

        }
    }
    public void deleteLast()
    {
        if(!isEmpty())
        {
            last = last.getPrevious();
            last.setNext(null);
        }
        else
        {
           throw new NullPointerException("List Is Empty");
        }

    }
    public void delete(int index)
    {
        int i = 0 ;
        Node start = head ;
        if(!isEmpty())
        {
            while (start != null)
            {
                if (index == i)
                {
                    break;
                }
                start = start.getNext();
                i++;
            }
            if (index == i)
            {
                if (index == 0)
                {
                    head = head.getNext();
                    if(head!=null)
                    {
                        head.setPrevious(null);
                    }

                }
                else if (index == size() - 1)
                {
                    last = last.getPrevious();
                    last.setNext(null);
                }
                else
                    {
                    Node previuos = start.getPrevious();
                    Node next = start.getNext();
                    previuos.setNext(next);
                    next.setPrevious(previuos);
                }
            }
            else
            {
                throw new IndexOutOfBoundsException("out of index");
            }
        }
        else
        {
            throw new NullPointerException("List Is Empty");
        }
    }

    @Override
    public int lastIndex()
    {
        int i = 0 ;

       Node start = head;
        while (start != null)
        {

            start = start.getNext();
            i++;
        }
        return i-1;
    }

    @Override
    public T firstOrDefault()
    {
        return (T) head.getIvalue();
    }

    @Override
    public int firstIndex()
    {
        return 0;
    }

    public void add(int index , T item)
    {
        Node newNode = new Node(item,null,null);
        int i = 0 ;
        Node start = head ;
        if(!isEmpty())
        {
            while (start != null)
            {
                if (index == i)
                {
                    break;
                }
                start = start.getNext();
                i++;
            }
            if (i == index)
            {

                if (index == 0)
                {
                    head.setPrevious(newNode);
                    newNode.setNext(head);
                    newNode.setPrevious(null);
                    head = newNode;
                }
                else if (index == size())// its mean the last index
                {
                    Node temp = last;
                    last.setNext(newNode);
                    last = newNode;
                    newNode.setPrevious(temp);
                }
                else
                {
                    Node temp = start.getPrevious();
                    start.setPrevious(newNode);
                    newNode.setNext(start);
                    newNode.setPrevious(temp);
                    temp.setNext(newNode);
                }
            }
            else
                {
                throw new IndexOutOfBoundsException("out of index");
            }
        }
        else
        {
            add(item);
        }

    }
    public void replace(int index , T item)
    {
        int i = 0 ;
        Node start = head ;
        if(!isEmpty())
        {
            while (start != null)
            {
                if (index == i)
                {
                    break;
                }
                start = start.getNext();
                i++;
            }
            if (i == index)
            {

           start.setIvalue(item);
            }
            else
            {
                throw new IndexOutOfBoundsException("out of index");
            }
        }
        else
        {
            throw new NullPointerException("List IS Empty");
        }

    }
    public T get(int index)
    {
        int i = 0 ;
        Node start = head ;
        Node value=null;
        if(!isEmpty())
        {
            while (start != null)
            {
                if (index == i)
                {
                   value=start;
                   break;
                }
                start = start.getNext();
                i++;
            }
            if (i == index)
            {

                return (T) value.getIvalue();
            }
            else
            {
                throw new IndexOutOfBoundsException("out of index");
            }
        }
        else
        {
            throw new NullPointerException("List IS Empty");
        }
    }
    public int size()
    {
        Node start = head ;
        int i = 0 ;
        while(start!=null)
        {
            i++;
            start=start.getNext();
        }
        return i;
    }
    public void dis()
    {
        Node start = head ;
        while (start!=null)
        {
            System.out.println(start.getIvalue());
            start=start.getNext();
        }
    }
    public boolean isEmpty()
    {
        return head ==null;
    }
    private class Node <T>
    {
        private T ivalue;
        private Node next ;
        private Node previous;

        public Node(T ivalue, LinkedList.Node next, LinkedList.Node previous)
        {
            this.ivalue = ivalue;
            this.next = next;
            this.previous = previous;
        }

        public T getIvalue()
        {
            return ivalue;
        }

        public void setIvalue(T ivalue)
        {
            this.ivalue = ivalue;
        }

        public LinkedList.Node getNext()
        {
            return next;
        }

        public void setNext(LinkedList.Node next)
        {
            this.next = next;
        }

        public LinkedList.Node getPrevious()
        {
            return previous;
        }

        public void setPrevious(LinkedList.Node previous)
        {
            this.previous = previous;
        }
    }
}
