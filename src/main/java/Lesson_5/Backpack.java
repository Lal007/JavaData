package Lesson_5;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    public static void main(String[] args) {
        Backpack backpack = new Backpack();
        List<Item> items = new ArrayList<>();
        items.add(new Item("Книга", 600, 1));
        items.add(new Item("Бинокль", 5000, 2));
        items.add(new Item("Аптечка", 1500, 4));
        items.add(new Item("Ноутбук", 40000, 2));
        items.add(new Item("Котелок", 500, 1));

        List<Item> result = backpack.findExp(items, 3, 0);

        for (Item item:result) {
            System.out.println(item.name + " ");
        }

    }

    public List<Item> findExp(List<Item> items, int maxWeight, int maxCost){
        int allWeight = 0;
        int allCost = 0;
        int itemMaxCost = maxCost;
        for (Item item:items) {
            allWeight += item.weight;
            allCost += item.cost;
            if (itemMaxCost < item.cost) itemMaxCost = item.cost;
        }
        if (allWeight <= maxWeight && allCost > maxCost){
            return items;
        } else {
            ArrayList<Item> decItems;
            for (int i = 0; i < items.size() - 1; i++) {
                decItems = new ArrayList<>(items);
                decItems.remove(i);
                List<Item> res = findExp(decItems, maxWeight, maxCost);

                int resAllWeight = 0;
                int resAllCost = 0;
                for (Item item:res) {
                    resAllWeight += item.weight;
                    resAllCost += item.cost;
                }
                if (resAllWeight <= maxWeight && resAllCost >= itemMaxCost){
                    return res;
                }
            }

            return new ArrayList<>();
        }
    }

    static class Item{
        String name;
        int cost;
        int weight;

        public Item(String name, int cost, int weight) {
            this.name = name;
            this.cost = cost;
            this.weight = weight;
        }
    }
}
