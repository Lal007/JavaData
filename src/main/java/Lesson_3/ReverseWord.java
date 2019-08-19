package Lesson_3;

import Lesson_3.stack.Stack;
import Lesson_3.stack.StackImpl;

public class ReverseWord {

    public static void main(String[] args) {
        System.out.println(new ReverseWord().reverse("Hello!"));
    }

    public String reverse(String word){
        Stack<Character> stack = new StackImpl<>(word.length());

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
