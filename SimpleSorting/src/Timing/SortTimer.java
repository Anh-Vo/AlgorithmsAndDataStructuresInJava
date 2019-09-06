package Timing;

import SortingArrays.ArraysToSort.SortMeArray;
import SortingArrays.SortingAlgorithms.BubbleSort;
import SortingArrays.SortingAlgorithms.InsertionSort;
import SortingArrays.SortingAlgorithms.SelectionSort;

public class SortTimer {
    public static void main(String[] args) {
        int maxSize = 10000;
        long[] test1 = new long[maxSize];
        long[] test2 = new long[maxSize];
        long[] test3 = new long[maxSize];


        insertRandomData(test1, maxSize);
        insertInverseSortedData(test2, maxSize);
        insertSortedData(test3, maxSize);

        SortMeArray bubble = new SortMeArray(test1, new BubbleSort());
        SortMeArray selection = new SortMeArray(test1, new SelectionSort());
        SortMeArray insertion = new SortMeArray(test1, new InsertionSort());

//        bubble.display();

        System.out.println("Begin time test1 -> random data");
        System.out.println("BubbleSort: "    +  time(bubble) + "ms");
        System.out.println("SelectionSort: " +  time(selection) + "ms");
        System.out.println("InsertionSort: "    +  time(insertion) + "ms");
        System.out.println("End time test1 \n");

        bubble = new SortMeArray(test2, new BubbleSort());
        selection = new SortMeArray(test2, new SelectionSort());
        insertion = new SortMeArray(test2, new InsertionSort());

//        bubble.display();

        System.out.println("Begin time test2 -> inversed data");
        System.out.println("BubbleSort: "    +  time(bubble) + "ms");
        System.out.println("SelectionSort: " +  time(selection) + "ms");
        System.out.println("InsertionSort: "    +  time(insertion) + "ms");
        System.out.println("End time test2 \n");

        bubble = new SortMeArray(test3, new BubbleSort());
        selection = new SortMeArray(test3, new SelectionSort());
        insertion = new SortMeArray(test3, new InsertionSort());

//        bubble.display();

        System.out.println("Begin time test3 -> sorted data");
        System.out.println("BubbleSort: "    +  time(bubble) + "ms");
        System.out.println("SelectionSort: " +  time(selection) + "ms");
        System.out.println("InsertionSort: "    +  time(insertion) + "ms");
        System.out.println("End time test3 \n");
    }

    public static void insertRandomData(long[] a, int maxSize) {
        for(int i = 0; i < maxSize; i++) {
            long n = (long) (Math.random()* (maxSize-1));
            a[i] = n;
        }
    }

    public static void insertInverseSortedData(long[] a, int maxSize) {
        int index = 0;
        for(long i = maxSize; i > 0; i--) {
            a[index] = i;
            index++;
        }
    }

    public static void insertSortedData(long[] a, int maxSize) {
        for(long i = 0; i < maxSize; i++) {
           a[(int)i] = i;
        }
    }

    public static long time(SortMeArray a) {
        long start = System.nanoTime();
        a.sort();
        long end = System.nanoTime();
        long time = (end - start) / 1000000;
        return time;
    }

}
