package interfaces;

public interface Stackx<E> {
    void push(E item);
    E pop();
    E peek();
    boolean isEmpty();
    boolean isFull();
}
