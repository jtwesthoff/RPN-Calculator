// Generic Stack Interface

public interface Stack<T>
{
    boolean empty();
    boolean full();
    boolean push(T el);
    T pop();

}