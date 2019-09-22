package Lists;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class UnorderedSinglyLinkedList<E> implements Iterable<E> {

    private class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
            next = null;
        }
    }

    private Node<E> head, tail;
    private long modificationCounter;
    private int currentSize;

    public UnorderedSinglyLinkedList() {
        head = tail = new Node<E>(null);
        modificationCounter = currentSize = 0;
    }

    public void insert(E data) {
        Node<E> newNode = new Node<E>(data);
        newNode.next = head.next;
        head.next = newNode;
        currentSize++;
        modificationCounter++;
    }

    public void displayList() {
        Node<E> curr = head.next;
        while(curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public boolean contains(E data) {
        Node<E> curr = head.next;
        while(curr != null) {
            if(((Comparable<E>)data).compareTo(curr.data) == 0) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public E delete(E data) {
        Node<E> curr = head.next;
        Node<E> prev = head;

        while(curr != null) {
            if(((Comparable<E>)data).compareTo(curr.data) == 0) {
                if(prev == head) {
                   head.next = prev.next;
                }
                modificationCounter++;
                return delete(curr, prev);
            }
            curr = curr.next;
            prev = prev.next;
        }
        return null;
    }

    @Override
    public Iterator<E> iterator() {
       return new IteratorHelper();
    }

    private E delete(Node<E> curr, Node<E> prev) {
       E temp = curr.data;
       prev.next = curr.next;
       currentSize--;
       return temp;
    }

    class IteratorHelper implements Iterator<E> {
        Node<E> current;
        long stateCheck;

        public IteratorHelper() {
            current = head;
            stateCheck = 0;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean hasNext() {
            if (stateCheck != modificationCounter) {
                throw new ConcurrentModificationException();
            }
            return current.next != null;
        }

        @Override
        public E next() {
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            E data = current.next.data;
            current = current.next;
            return data;
        }
    }

}
