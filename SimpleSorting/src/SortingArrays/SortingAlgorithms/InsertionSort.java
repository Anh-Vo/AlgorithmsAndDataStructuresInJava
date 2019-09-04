package SortingArrays.SortingAlgorithms;

import SortingInterfaces.ArraySorter;

public class InsertionSort implements ArraySorter {
//    @Override
//    public void sort(long[] arr) {
//        int in;
//        int largest = 0;
//
//        for(int out = arr.length-1; out > 0; out--) {
//            for(in = 0; in < out; in++) {
//                if(arr[in] > arr[largest]) {
//                    largest = in;
//                }
//            }
//            swap(arr, largest, out);
//            largest = 0;
//        }
//    }
    @Override
    public void sort(long[] arr) {
        int smallestIndex = 0;
        for(int unsorted = 0; unsorted < arr.length-1; unsorted++) {
            for(int curr = unsorted; curr < arr.length; curr++) {
                if(arr[curr] < arr[smallestIndex]) {
                    smallestIndex = curr;
                }
            }
            swap(arr, unsorted, smallestIndex);
        }
    }

    @Override
    public void swap(long[] arr, int a, int b) {
        long temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
