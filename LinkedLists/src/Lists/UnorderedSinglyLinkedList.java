package Lists;

public class UnorderedSinglyLinkedList<E> {
    private class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
            next = null;
        }
    }

    private Node<E> head, tail;

    public UnorderedSinglyLinkedList() {
        head = tail = new Node<E>(null);
    }

    public void insert(E data) {
        Node<E> newNode = new Node<E>(data);
        newNode.next = head.next;
        head.next = newNode;
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
                return delete(curr, prev);
            }
            curr = curr.next;
            prev = prev.next;
        }
        return null;
    }

//    public int deleteAll(E data) {
//        Node<E> curr = head.next;
//
//    }

    private E delete(Node<E> curr, Node<E> prev) {
       E temp = curr.data;
       prev.next = curr.next;
       return temp;
    }

}
