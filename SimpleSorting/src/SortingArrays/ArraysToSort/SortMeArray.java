package SortingArrays.ArraysToSort;

import SortingInterfaces.ArraySorter;

public class SortMeArray {
    private long[] arr;
    private int numElems;
    private ArraySorter sorter;

    public SortMeArray(int max, ArraySorter arraySorter) {
        arr = new long[max];
        numElems = 0;
        sorter = arraySorter;
    }

    public int getNumElems() {
        return numElems;
    }

    public void insert(long value) {
        arr[numElems++] = value;
    }

    public void sort() {
        sorter.sort(arr);
    }

    public void display() {
        for(int i = 0; i < numElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public long getElement(int index) {
        return arr[index];
    }

    public void setElement(int index, long value) {
        arr[index] = value;
    }

    public void swap(int a, int b) {
        long temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }




}
