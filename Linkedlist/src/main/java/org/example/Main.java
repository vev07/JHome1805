package org.example;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
     MyLinkedlList list = new MyLinkedlList();
     list.addFirst(10);
     list.addFirst(20);
     list.addLast(30);
     list.addLast(40);
     list.addLast(50);
     list.addLast(60);
     list.addLast(70);

     list.addByIndex(40,2);
     list.print();

     System.out.println("list.removeFirst();_________________");
     list.removeFirst();
     list.print();
     System.out.println("list.removeLast();________________");
     list.removeLast();
     list.print();

        System.out.println("list.removeAt(10);_______________");
        list.removeAt(10);
        list.print();


        ListIteratorInteger listIteratorInteger = new ListIteratorInteger();


    }


}
