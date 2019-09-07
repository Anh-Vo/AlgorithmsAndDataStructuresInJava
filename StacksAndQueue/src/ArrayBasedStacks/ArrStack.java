package ArrayBasedStacks;

import interfaces.Stackx;

public class ArrStack implements Stackx {
    private int top;
    private int maxSize;
    private long[] arr;

    public ArrStack(int max) {
        maxSize = max;
        arr = new long[maxSize];
        top = -1;
    }
    @Override
    public void push(long item) {
        arr[++top] = item;
    }

    @Override
    public long pop() {
        return arr[top--];
    }

    @Override
    public long peek() {
       return arr[top];
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
       return (top == maxSize-1);
    }

    public void display() {
        int fakeTop = top;
        while(fakeTop > -1) {
            System.out.print(arr[fakeTop--] + " ");
        }
        System.out.println();
    }
}
