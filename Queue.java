package com.bridgelabz.datastructure;

public class Queue<T> {
    LinkedList<T> linkedList;

    public Queue() {
        this.linkedList = new LinkedList<>();
    }

    public void add(T key) {
        linkedList.add(key);
    }

    public void print() {
        linkedList.print();
    }


    public T remove() {
        linkedList.remove();
        return null;
    }
}
