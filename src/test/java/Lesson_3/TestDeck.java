package Lesson_3;

import Lesson_3.Deck.Deck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDeck {

    Deck<Integer> deck;

    @BeforeEach
    void init(){
        deck = new Deck<>(5);

        for (int i = 1; i < 3; i++) {
            deck.insertRight(0);
        }

    }

    @Test
    void testInsertLeft(){
        for (int i = 1; i <= 6; i++) {
            deck.insertLeft(i);
        }

        StringBuilder sb = new StringBuilder();

        while (!deck.isEmpty()){
            sb.append(deck.removeLeft());
        }

        Assertions.assertEquals("32100", sb.toString());
    }

    @Test
    void testInsertRight(){
        for (int i = 1; i <= 6; i++) {
            deck.insertRight(i);
        }

        StringBuilder sb = new StringBuilder();

        while (!deck.isEmpty()){
            sb.append(deck.removeLeft());
        }

        Assertions.assertEquals("00123", sb.toString());
    }

    @Test
    void testRemoveRight(){

        Deck<Integer> deck2 = new Deck<>(5);
        for (int i = 1; i < 3; i++) {
            deck2.insertLeft(i);
        }

        StringBuilder sb = new StringBuilder();

        while (!deck2.isEmpty()){
            sb.append(deck2.removeRight());
        }

        Assertions.assertEquals("12", sb.toString());
    }

    @Test
    void testRemoveLeft(){
        for (int i = 1; i < 4; i++) {
            deck.insertRight(i);
        }

        StringBuilder sb = new StringBuilder();

        while (!deck.isEmpty()){
            sb.append(deck.removeLeft());
        }

        Assertions.assertEquals("00123", sb.toString());
    }

}
