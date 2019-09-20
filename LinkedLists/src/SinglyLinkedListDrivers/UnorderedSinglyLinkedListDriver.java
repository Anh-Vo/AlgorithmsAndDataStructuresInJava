package SinglyLinkedListDrivers;

import Lists.UnorderedSinglyLinkedList;

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

        System.out.println("Delete 5");
        System.out.println(list.delete(5));
        System.out.println(list.contains(5));
        list.displayList();

        System.out.println("Delete 2");
        System.out.println(list.delete(2));
        System.out.println(list.contains(2));
        list.displayList();

        System.out.println("Insert 5");
        list.insert(5);
        list.displayList();

        System.out.println("Delete 4");
        System.out.println(list.delete(4));
        System.out.println(list.contains(4));
        list.displayList();
    }
}
