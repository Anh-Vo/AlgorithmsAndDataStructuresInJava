package Queues.ArrayBasedQueues;

public class PriorityQ {
    private int maxSize;
    private long[] arr;
    private int numItems;

    public PriorityQ(int s) {
        maxSize = s;
        arr = new long[maxSize];
        numItems = 0;
    }

    public void insert(long item) {
        int i;
        if(numItems == 0) {
            arr[numItems++] = item;
        } else {
            for(i = numItems - 1; i >= 0; i--) {
                if (item > arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
                arr[i+1] = item;
                numItems++;
        }
    }

    public void display() {
        for(int i = 0; i < maxSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public long remove() {
        return arr[--numItems];
    }

    public long peekMin() {
        return arr[numItems - 1];
    }

    public boolean isEmpty() {
       return (numItems == 0);
    }

    public boolean isFull() {
        return (numItems == maxSize);
    }
}
