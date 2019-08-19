package Lesson_4;

import Lesson_4.linkedlist.LinkedList;
import Lesson_4.linkedlist.SimpleLinkedListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class testIterator {

    LinkedList<Integer> ll;

    @BeforeEach
    void init(){
        ll = new SimpleLinkedListImpl<>();
    }

    @Test
    void testForeach(){
        for (int i = 1; i < 10; i++) {
            ll.insertFirst(i);
        }

        StringBuilder sb = new StringBuilder();

        for (Integer i:ll) {
            sb.append(i);
        }

        Assertions.assertEquals("987654321", sb.toString());
    }

    @Test
    void testIteratorHasNext(){
        Iterator <Integer> iter = ll.iterator();

        Assertions.assertFalse(iter.hasNext());
    }

    @Test
    void testIterationNext(){
        ll.insertFirst(1);

        Iterator<Integer> iter = ll.iterator();

        Assertions.assertTrue(iter.hasNext());

        Assertions.assertEquals(1, iter.next());
    }
}
