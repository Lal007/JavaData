package Lesson_8;

public class Main8 {

    public static void main(String[] args) {
//        HashTable<ItemDefinition, Integer> hashTable = new HashTableImpl<>(5);
//        HashTable<ItemDefinition, Integer> hashTable = new DoubleHashTableImpl<>(5);
        HashTable<ItemDefinition, Integer> hashTable = new ChainHashMap<>(5);

        ItemDefinition orange = new ItemDefinition(1, "Orange");
        ItemDefinition banana = new ItemDefinition(71, "Banana");
        ItemDefinition lemon = new ItemDefinition(60, "Lemon");
        ItemDefinition milk = new ItemDefinition(52, "Milk");
        ItemDefinition potato = new ItemDefinition(21, "Potato");

        hashTable.put(orange, 150);
        hashTable.put(banana, 100);
        hashTable.put(lemon, 250);
        hashTable.put(milk, 120);
        hashTable.put(potato, 67);

        System.out.println("Size is " + hashTable.size());
        System.out.println("Is Full? " + hashTable.isFull());

        hashTable.display();

        System.out.println(hashTable.get(milk));

        hashTable.remove(lemon);

        System.out.println("Size is " + hashTable.size());
        System.out.println("Is Full? " + hashTable.isFull());

        hashTable.display();
    }
}
