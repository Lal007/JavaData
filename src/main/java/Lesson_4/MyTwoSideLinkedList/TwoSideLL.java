package Lesson_4.MyTwoSideLinkedList;

import java.util.Iterator;

public class TwoSideLL<E> implements MyLinkedList<E> {

    private Node<E> firstElement;
    private Node<E> lastElement;
    protected int size;

    @Override
    public void insertFirst(E value) {
        Node<E> node = new Node<>(value);

        if (firstElement != null) firstElement.prev = node;

        node.next = firstElement;
        firstElement = node;
        size++;

        if (size == 1) {
            lastElement = firstElement;
        }
    }

    @Override
    public void insertLast(E value) {
        Node<E> node = new Node<>(value);
        node.prev = lastElement;
        if (lastElement != null){
            lastElement.next = node;
        }
        lastElement = node;
        size++;

        if (size == 1) firstElement = lastElement;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) return null;

        E value = firstElement.value;
        firstElement = firstElement.next;
        if (firstElement != null) firstElement.prev = null;

        size--;
        return value;
    }

    @Override
    public boolean remove(E value) {
        Node<E> current = firstElement;
        while (current != null){
            if (current.value.equals(value)){
                break;
            }

            current = current.next;
        }

        if (current == null) return false;
        else if (current == firstElement && current == lastElement) {
            firstElement = null;
            lastElement = null;
        } else {
            Node<E> prev = current.prev;
            Node<E> next = current.next;

            prev.next = next;
            next.prev = prev;
        }

        size--;

        return true;

    }

    @Override
    public boolean contains(E value) {
        Node<E> current = firstElement;
        while (current != null){
            if (current.value.equals(value)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void display() {
        System.out.println("----------");
        Node<E> current = firstElement;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println("----------");
    }

    @Override
    public E getFirstValue() {
        return firstElement != null ? firstElement.value : null;
    }

    @Override
    public Node<E> getFirst() {
        return firstElement;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
