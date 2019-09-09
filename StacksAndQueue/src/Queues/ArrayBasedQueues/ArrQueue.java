package Queues.ArrayBasedQueues;

import interfaces.Queuex;

import java.util.Queue;

public class ArrQueue implements Queuex<Long> {
    private int maxSize;
    private long[] arr;
    private int front;
    private int rear;
    private int numItems;

    public ArrQueue(int s) {
        maxSize = s;
        arr = new long[maxSize];
        front = 0;
        rear = -1;
        numItems = 0;
    }

    @Override
    public void enque(Long item) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        arr[++rear] = item;
        numItems++;
    }

    @Override
    public Long deque() {
        long temp = arr[front++];
        if(front == maxSize) {
            front = 0;
        }
         numItems--;
        return temp;
    }

    @Override
    public Long peekFront() {
        return arr[front];
    }

    @Override
    public boolean isfull() {
        return (numItems == maxSize);
    }

    @Override
    public boolean isEmpty() {
        return (numItems == 0);
    }

    @Override
    public int size() {
        return numItems;
    }
}
