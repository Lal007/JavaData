package Lesson_4.MyTwoSideLinkedList;

import Lesson_3.ICollection;

public interface MyLinkedList<E> extends ICollection, Iterable<E> {
    void insertFirst(E value);

    void insertLast(E value);

    E removeFirst();

    boolean remove(E value);

    boolean contains(E value);

    void display();

    E getFirstValue();

    Node<E> getFirst();

    @Override
    default boolean isFull() {
        return false;
    }

    class Node<T> {
        public final T value;
        public Node<T> next;
        public Node<T> prev;

        public Node(T value) {
            this.value = value;
        }
    }
}
