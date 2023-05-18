package org.example;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInteger {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");

    }

    }

}
