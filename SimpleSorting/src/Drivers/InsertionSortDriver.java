package Drivers;

import SortingArrays.ArraysToSort.SortMeArray;
import SortingArrays.SortingAlgorithms.InsertionSort;
import Interfaces.ArraySorter;

public class InsertionSortDriver {
    public static void main(String[] args) {
        ArraySorter sorter = new InsertionSort();
        SortMeArray ab = new SortMeArray(9, sorter);
        ab.insert(55);
        ab.insert(100);
        ab.insert(85);
        ab.insert(22);
        ab.insert(500);
        ab.insert(2);

        ab.display();
        ab.sort();
        ab.display();
        System.out.println("median is: " + ab.getMedian());

        System.out.println("Testing remove Dups");
        ab.reset();
        ab.insert(1);
        ab.insert(2);
        ab.insert(3);
        ab.insert(4);
        ab.insert(4);
        ab.insert(4);
        ab.insert(5);
        ab.insert(5);
        ab.insert(6);
        ab.display();
        ab.removeDups();
        ab.display();
    }
}
