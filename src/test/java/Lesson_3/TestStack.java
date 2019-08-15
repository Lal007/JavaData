package Lesson_3;

import Lesson_3.stack.Stack;
import Lesson_3.stack.StackImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStack {

    Stack<Integer> stack;

    @BeforeEach
    void init(){
        stack = new StackImpl<>(5);

        for (int i = 1; i < 7; i++) {
            stack.push(i);
        }
    }

    @Test
    void testPushPeek(){

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        Assertions.assertEquals("54321", sb.toString());
    }

    @Test
    void testPeek(){

        Assertions.assertEquals(5, stack.peek());
    }

    @Test
    void testSize(){

        Assertions.assertEquals(5, stack.size());
    }

    @Test
    void testIsEmpty(){

        Assertions.assertFalse(stack.isEmpty());
    }

    @Test
    void testIsFull(){
        Assertions.assertTrue(stack.isFull());
    }
}
