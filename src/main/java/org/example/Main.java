package org.example;

import org.example.MyCollections.MyBinaryTree;
import org.example.MyCollections.MySet;

public class Main {
    public static void main(String[] args) {
        MySet<Integer> set = new MySet<>();
        set.add(90);
        set.add(7890);
        set.add(11);
        set.add(21);
        set.delete(11);
        set.printSet();
    }
}