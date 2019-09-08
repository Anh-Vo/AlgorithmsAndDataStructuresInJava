package interfaces;

public interface Stackx<T> {
    void push(long item);
    T pop();
    T peek();
    boolean isEmpty();
    boolean isFull();
}
