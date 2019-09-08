package interfaces;

public interface Stackx<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    boolean isFull();
}
