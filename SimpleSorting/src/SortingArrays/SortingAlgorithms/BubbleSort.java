package SortingArrays.SortingAlgorithms;

import SortingInterfaces.ArraySorter;

public class BubbleSort implements ArraySorter {

    public void sort(long[] arr) {
        int out, in;
        for (out = arr.length - 1; out > 0; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    swap(arr, in, in + 1);
                }
            }
        }
    }

    public void swap(long[] arr, int a, int b) {
        long temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

//    public void bubbleSortHighToLow(long[] arr) {
//        for (int out = arr.length - 1; out > 0; out--) {
//            for (int in = 0; in < out; in++) {
//                if (arr[in] < arr[in + 1]) {
//                    swap(in, in + 1);
//                }
//            }
//        }
//    }
//
//    public void bubbleSortLeft(long[] arr) {
//        for (int out = arr.length - 1; out > 0; out--) {
//            for (int in = out; in > 0; in--) {
//                if (arr.getElement(in < arr[in - 1]) {
//                    swap(in - 1, in);
//                    System.out.println("Swapping " + arr[in - 1] + " " + arr[in]);
//                    display();
//                }
//            }
//        }
//    }


//    public void bubbleSort() {
//        for(int out = arr.length()-1; out > 0; out--) {
//            for(int in = 0; in <= arr.length()-2; in++) {
//                if(arr[in] > arr[in+1]) {
//                    swap(in, in+1);
//                }
//            }
//        }
//
//   }

}
