package SortingArrays.ArraysToSort;

import Interfaces.ArraySorter;
import Interfaces.NoDups;
import utilities.NoDuplicates;

public class SortMeArray {
    private long[] arr;
    private int numElems;
    private ArraySorter sorter;
    private NoDups arrayDup;

    public SortMeArray(int max, ArraySorter arraySorter) {
        arr = new long[max];
        numElems = 0;
        sorter = arraySorter;
        arrayDup = new NoDuplicates();
    }

    public SortMeArray(long[] a, ArraySorter arraySorter) {
        arr = a.clone();
        sorter = arraySorter;
        numElems = a.length;
        arrayDup = new NoDuplicates();
    }

    public void cloneArray(long[] a) {
        arr = a.clone();
        numElems = a.length;
    }

    public void reset() {
        numElems = 0;
    }

    public long getMedian() {
        sort();
        return arr[arr.length/2];
    }


    public void removeDups() {
        int numDups = arrayDup.removeArrayDups(arr);
        numElems -= numDups;
    }

    public int getNumElems() {
        return numElems;
    }

    public void insert(long value) {
        if(numElems < arr.length) {
            arr[numElems++] = value;
        }
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
