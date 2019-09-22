package SinglyLinkedListDrivers;

import Lists.UnorderedSinglyLinkedList;

import java.util.Iterator;

public class UnorderedSinglyLinkedListDriver {
    public static void main(String[] args) {
        UnorderedSinglyLinkedList<Integer> list = new UnorderedSinglyLinkedList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.displayList();

        UnorderedSinglyLinkedList<Integer> list2 = new UnorderedSinglyLinkedList<>();
        list2.insert(5);
        list2.insert(4);
        list2.insert(3);
        list2.insert(2);
        list2.insert(1);
        list2.displayList();

        System.out.println("Testing Iterator: ");
        Iterator<Integer> it = list.iterator();
        for(int i : list) {
            System.out.println(i);
        }


    }
}
