package Lesson_3;

import Lesson_3.queue.Queue;
import Lesson_3.queue.QueueImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testQueue {

    Queue<Integer> queue;

    @BeforeEach
    void init(){
        queue = new QueueImpl<>(5);

        for (int i = 1; i < 7; i++) {
            queue.insert(i);
        }
    }

    @Test
    void testInsert(){
        StringBuilder sb = new StringBuilder();

        while (!queue.isEmpty()){
            sb.append(queue.remove());
        }

        Assertions.assertEquals("12345", sb.toString());
    }

    @Test
    void testPeek(){
        Assertions.assertEquals(1, queue.peek());
    }

    @Test
    void testSize(){
        Assertions.assertEquals(5, queue.size());
    }

    @Test
    void testIsEmpty(){
        Assertions.assertFalse(queue.isEmpty());
    }

    @Test
    void testIsFull(){
        Assertions.assertTrue(queue.isFull());
    }
}
