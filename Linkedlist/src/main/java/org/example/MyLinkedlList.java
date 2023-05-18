package org.example;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;

public class MyLinkedlList {
    private Node head;
    private Node tail;
    public MyLinkedlList() {
        head = null;
        tail = null;
    }
    private boolean isEmpty() {
        return head == null;
    }
    public void addFirst(int data) {
        Node temp = new Node(data);
        if(isEmpty()) {
            tail = temp;
        } else {
            head.prev = temp;
        }
        temp.next = head;
        head = temp;
    }
    public void addLast(int data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            head = temp;
        } else {
            tail.next = temp;
        }
        temp.prev = tail;
        tail = temp;
    }
    public void addByIndex(int data, int index) {
        Node current = head;
        int counter = 0;
        while (current != null && counter != index) {
            current = current.next;
            counter++;
        }
        Node temp = new Node(data);
        current.prev.next = temp;
        temp.prev = current.prev;
        current.prev = temp;
        temp.next = current;
    }
    public void removeFirst() {
        if (head.next == null) {
            tail = null;
        } else {
            head.next.prev = null;
        }
        head = head.next;
    }
    public void removeLast() {
        if (head.next == null) {
            head = null;
        } else {
            tail.prev.next = null;
        }
        tail = tail.prev;
    }
    public void removeAt(int key) {
         Node current = head;
         while (current.data != key) {
             current = current.next;
             if (current == null) {
                 return;
             }
         }
         if (current == head) {
             removeFirst();
         } else {
             current.prev.next = current.next;
         }
         if (current == tail) {
             removeLast();
         } else {
             current.next.prev = current.prev;
         }
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
