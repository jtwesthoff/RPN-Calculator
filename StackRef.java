// Generic Stack Reference Implementation

public class StackRef<T> implements Stack<T>
{

    private Node<T> top;

    public StackRef (int size)
    {
        top = null;
    }

    public StackRef()
    {
        top = null;
    }

    public boolean empty()
    {
        return top == null;
    }

    public boolean full()
    {
        return false;
    }

    public boolean push(T el)
    {
        Node<T> node = new Node<>(el, top);
        top = node;
        return true;
    }

    public T pop()
    {
        if (empty())
            return null;

        T el = top.getData();
        top = top.getNext();
        return el;
    }


}