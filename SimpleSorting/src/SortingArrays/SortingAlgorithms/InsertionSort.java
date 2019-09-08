package SortingArrays.SortingAlgorithms;

import Interfaces.ArraySorter;

public class InsertionSort implements ArraySorter {

    @Override
    public void sort(long[] arr) {
        int in;
        long temp;

        for(int out = 1; out < arr.length; out++) {
            temp = arr[out];
            in = out;
            while(in > 0 && arr[in-1] >= temp) {
                arr[in] = arr[in-1];
                in--;
            }
            arr[in] = temp;
        }
    }

    @Override
    public void swap(long[] arr, int a, int b) {

    }
}
