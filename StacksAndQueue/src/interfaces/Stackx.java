package interfaces;

public interface Stackx {
    void push(long item);
    long pop();
    long peek();
    boolean isEmpty();
    boolean isFull();
}
