package Lesson_3.Deck;


import Lesson_3.queue.QueueImpl;

public class Deck<E> extends QueueImpl<E>{
    public Deck(int maxCapacity) {
        super(maxCapacity);
    }

    public boolean insertRight(E value){
        return super.insert(value);
    }

    public boolean insertLeft(E value){
        if (isFull()){
            return false;
        }

        if (head == 0){
            head = data.length;
        }

        data[--head] = value;
        size++;
        return true;
    }

    public E removeLeft(){
        return super.remove();
    }

    public E removeRight(){
        if (isEmpty()){
            return null;
        }

        E value = data[tail];
        size--;

        if (isEmpty()){
            tail = DEFAULT_TAIL;
            return value;
        }else if (tail != 0){
            tail--;
            return value;
        }else tail = data.length - 1;
        return value;
    }

}
