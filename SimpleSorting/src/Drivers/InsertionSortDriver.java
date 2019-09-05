package Drivers;

import SortingArrays.ArraysToSort.SortMeArray;
import SortingArrays.SortingAlgorithms.InsertionSort;
import SortingInterfaces.ArraySorter;

public class InsertionSortDriver {
    public static void main(String[] args) {
        ArraySorter sorter = new InsertionSort();
        SortMeArray ab = new SortMeArray(5, sorter);
        ab.insert(55);
        ab.insert(100);
        ab.insert(85);
        ab.insert(22);
        ab.insert(500);

        ab.display();
        ab.sort();
        ab.display();
    }
}
