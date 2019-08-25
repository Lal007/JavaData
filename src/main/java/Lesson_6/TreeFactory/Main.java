package Lesson_6.TreeFactory;

import Lesson_6.Node;
import Lesson_6.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        List<MyTreeImpl<Integer>> trees = main.createTrees();

        int countTrees = trees.size();
        int countBalanced = 0;

        for (MyTreeImpl<Integer> tree : trees) {
            if (tree.getBalanced()){
                countBalanced++;
            }
        }

        System.out.println("Сбалансированных деревьев "  + countBalanced * 100 / countTrees + "%");
    }

    List<MyTreeImpl<Integer>> createTrees(){
        ArrayList<MyTreeImpl<Integer>> trees = new ArrayList<>();
        Random random = new Random();
        //int rnd = (random.nextInt(50) - 25);

        for (int i = 0; i < 20; i++) {
            MyTreeImpl<Integer> tree = new MyTreeImpl<>();
            boolean added = true;
            while (added){
                added = tree.add((random.nextInt(50) - 25));
            }

            trees.add(tree);
        }
        return trees;
    }
}
