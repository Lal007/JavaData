package Lesson_8;

import java.util.LinkedList;
import java.util.List;

public class ChainHashMap<K, V> implements HashTable<K, V> {

    private static class Node<K, V> implements Entry<K, V>{
        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public void setKey(K key) {
            this.key = key;
        }

        @Override
        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    private LinkedList<Node<K, V>>[] data;
    private int size;
    private int maxSize;

    @SuppressWarnings("unchecked")
    public ChainHashMap(int maxSize) {
        this.maxSize = maxSize;
        this.data = new LinkedList[maxSize * 2];
    }

    private int hashFunc(K key) {
        return key.hashCode() % data.length;
    }

    @Override
    public boolean put(K key, V value) {
        if (isFull()) return false;

        int index = hashFunc(key);
        LinkedList<Node<K, V>> nodeList = data[index];
        if (nodeList == null) {
            nodeList = new LinkedList<>();
            data[index] = nodeList;
        }
        nodeList.add(new Node<>(key, value));
        size++;
        return true;
    }

    @Override
    public V get(K key) {
        LinkedList<Node<K, V>> nodeList = data[hashFunc(key)];
        if (nodeList.size() == 0) return null;
        for (Node<K, V> node:nodeList) {
            if (node.getKey().equals(key)) return node.getValue();
        }
        return null;
    }

    @Override
    public boolean contains(K key) {
        if (get(key) != null) return true;
        return false;
    }

    @Override
    public V remove(K key) {
        LinkedList<Node<K, V>> nodeList = data[hashFunc(key)];
        if (nodeList.size() == 0) return null;
        for (Node<K, V> node:nodeList) {
            if (node.getKey().equals(key)){
                nodeList.remove(node);
                size--;
                return node.getValue();
            }
        }
        return null;
    }

    @Override
    public void display() {
        System.out.println("-----");
        for (int i = 0; i < data.length; i++) {
            List<Node<K, V>> nodeList = data[i];
            if (nodeList == null) System.out.println("[null]");
            else {
                for (Node<K, V> node:nodeList) {
                    System.out.println("[Key = " + node.getKey() + " Value = " + node.getValue() + "]");
                }
                System.out.println("End of list");
            }
        }
        System.out.println("-----");

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == maxSize;
    }
}
