package Lesson_4;

import Lesson_4.linkedlist.LinkedStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testLinkedStack {
    LinkedStack<Integer> linkedStack;

    @BeforeEach
    void init(){
        linkedStack = new LinkedStack<>();
    }

    @Test
    void testInsertRemove(){
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);

        StringBuilder sb = new StringBuilder();

        while (!linkedStack.isEmpty()){
            sb.append(linkedStack.pop());
        }

        Assertions.assertEquals("321", sb.toString());
    }

    @Test
    void testPeek(){
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);

        Assertions.assertEquals(3, linkedStack.peek());
    }
}
