package Drivers;

import SortingArrays.ArraysToSort.SortMeArray;
import SortingArrays.SortingAlgorithms.SelectionSort;

public class selectionSortArrayDriver {
    public static void main(String[] args) {
        SortMeArray arr = new SortMeArray(5, new SelectionSort());
        arr.insert(33);
        arr.insert(44);
        arr.insert(22);
        arr.insert(55);
        arr.insert(11);

        arr.display();
        arr.sort();
        arr.display();
    }
}
