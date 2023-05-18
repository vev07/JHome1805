package org.example;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListeratorString {
    public static void main(String[] args) {
        List<String> listLinkedEx = new LinkedList<>();
        listLinkedEx.add("I ");
        listLinkedEx.add("love ");
        listLinkedEx.add("my ");
        listLinkedEx.add("wife!");
        System.out.print(listLinkedEx);
        System.out.println();

        ListIterator listIterator = listLinkedEx.listIterator();

        while (listIterator.hasNext()) {
            System.out.print(listIterator.next());
        }
        System.out.println();
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous());
        }
    }
}
