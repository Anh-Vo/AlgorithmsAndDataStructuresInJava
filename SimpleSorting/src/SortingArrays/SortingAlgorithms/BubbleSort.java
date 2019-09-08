package SortingArrays.SortingAlgorithms;

import Interfaces.ArraySorter;

public class BubbleSort implements ArraySorter {

    /**
     * This is plain ol' bubble sort. We're taking the largest element
     * from the left end of the array and shifting it towards the right.
     */
//    public void sort(long[] arr) {
//        int out, in;
//        for (out = arr.length - 1; out > 0; out--) {
//            for (in = 0; in < out; in++) {
//                if (arr[in] > arr[in + 1]) {
//                    swap(arr, in, in + 1);
//                }
//            }
//        }
//    }

    public void swap(long[] arr, int a, int b) {
        System.out.println("Swapping: " + arr[a] + " " + arr[b]);
        long temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * A modified version of bubble sort and moves the largest from the left
     * to the right side of the array and then moves the smallest item from
     * the right to the left.
     */
    public void sort(long[] arr) {
        int out, out2, in;
        for(out = arr.length-1; out > 0; out--) {
           for(in = 0; in < out; in++) {
               if(arr[in] > arr[in+1]) {
                   swap(arr, in, in+1);
               }
           }
           for(out2 = out; out2 > 0; out2--) {
               if(arr[out2] < arr[out2-1]) {
                   swap(arr, out2,out2-1);
               }
           }
        }
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
