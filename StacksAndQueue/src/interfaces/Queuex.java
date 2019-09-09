package interfaces;

public interface Queuex<T> {
    void enque(T item);
    T deque();
    T peekFront();
    boolean isfull();
    boolean isEmpty();
    int size();
}
