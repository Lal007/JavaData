package Lesson_4;

import Lesson_4.MyTwoSideLinkedList.TwoSideLL;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testTwoSideLL {

    TwoSideLL<Integer> ll;

    @BeforeEach
    void init(){
        ll = new TwoSideLL<>();
    }

    @Test
    void testInsertFirs(){
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);

        StringBuilder sb = new StringBuilder();
        while (!ll.isEmpty()){
            sb.append(ll.removeFirst());
        }

        Assertions.assertEquals("321" , sb.toString());
    }

    @Test
    void testInsertLast(){
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(3);

        StringBuilder sb = new StringBuilder();
        while (!ll.isEmpty()){
            sb.append(ll.removeFirst());
        }

        Assertions.assertEquals("123" , sb.toString());
    }
}
