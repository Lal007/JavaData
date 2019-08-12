package Lesson_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestArray {

    private ArrayImpl<Integer> array;

    @BeforeEach
    public void init(){
        array = new ArrayImpl<>();
        for (int i = 1; i < 11; i++) {
            array.add(i);
        }
    }

    @Test
    public void testAdd(){
        String expect = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]";

        Assertions.assertEquals(expect, array.toString());
    }

    @Test
    public void testAddAll(){
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]";
        ArrayImpl<Integer> array1 = new ArrayImpl<>();
        array1.addAll(1, 2, 3 ,4 ,5 ,6 ,7 ,8 ,9, 10, 11, 12, 13);

        Assertions.assertEquals(expected, array1.toString());
    }

    @Test
    public void testRemoveByValue(){
        String expect = "[1, 2, 3, 4, 6, 7, 8, 9, 10]";

        array.remove(5);

        Assertions.assertEquals(expect, array.toString());

    }

    @Test
    public void testRemoveByIndex(){
        String expect = "[2, 3, 4, 5, 6, 7, 8, 9, 10]";

        array.removeByIndex(0);

        Assertions.assertEquals(expect, array.toString());
    }

    @Test
    public void testRemoveException(){

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> array.removeByIndex(-1));
    }

    @Test
    public void testIndexOf(){
        Assertions.assertEquals(6, array.indexOf(7));
    }

    @Test
    public void testContains(){
        Assertions.assertTrue(array.contains(5));
    }

    @Test
    public void testSize(){
        Assertions.assertEquals(10, array.size());
    }
}
