package Drivers;

import SortingArrays.ArraysToSort.SortMeArray;
import SortingArrays.SortingAlgorithms.BubbleSort;
import SortingInterfaces.ArraySorter;

public class BubbleArrayDriver {
    public static void main(String[] args) {
        ArraySorter sorter = new BubbleSort();
        SortMeArray ab = new SortMeArray(5, sorter);
        ab.insert(55);
        ab.insert(100);
        ab.insert(85);
        ab.insert(22);
        ab.insert(500);

        System.out.println(ab.getNumElems());

        ab.display();

//        ab.bubbleSort();
//        ab.bubbleSortHighToLow();
        ab.sort();
        ab.display();


    }

}
