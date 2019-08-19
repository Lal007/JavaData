package Lesson_4;

import Lesson_4.linkedlist.LinkedList;
import Lesson_4.linkedlist.SimpleLinkedListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}
