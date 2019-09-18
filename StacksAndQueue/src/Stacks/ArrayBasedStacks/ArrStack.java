package Stacks.ArrayBasedStacks;

import interfaces.Stackx;

public class ArrStack implements Stackx<Character> {
    private int top;
    private int maxSize;
    private Character[] arr;

    public ArrStack(int max) {
        maxSize = max;
        arr = new Character[maxSize];
        top = -1;
    }

    @Override
    public void push(Character item) {
        arr[++top] = item;
    }

    @Override
    public Character pop() {
        return arr[top--];
    }

    @Override
    public Character peek() {
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
        int fakeCharacterop = top;
        while(fakeCharacterop > -1) {
            System.out.print(arr[fakeCharacterop--] + " ");
        }
        System.out.println();
    }
}
