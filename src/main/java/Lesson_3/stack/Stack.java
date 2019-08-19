package Lesson_3.stack;


import Lesson_3.ICollection;

public interface Stack<E> extends ICollection {

    boolean push(E value);

    E pop();

    E peek();

}
