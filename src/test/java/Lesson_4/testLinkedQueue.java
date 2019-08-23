package Lesson_4;

import Lesson_4.linkedlist.LinkedQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testLinkedQueue {

    LinkedQueue<Integer> linque;

    @BeforeEach
    void init(){
        linque = new LinkedQueue<>();
    }

    @Test
    void testInsertRemove(){
        linque.insert(1);
        linque.insert(2);
        linque.insert(3);

        StringBuilder sb = new StringBuilder();

        while (!linque.isEmpty()){
            sb.append(linque.remove());
        }

        Assertions.assertEquals("123", sb.toString());
    }

    @Test
    void testPeek(){
        linque.insert(1);
        linque.insert(2);
        linque.insert(3);

        Assertions.assertEquals(1, linque.peek());
    }
}
