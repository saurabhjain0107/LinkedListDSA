package com.bridgelabz.datastructure;

public class Stack<T> {
    LinkedList<T> linkedList;

    public Stack(){
        this.linkedList = new LinkedList<>();
    }

    public void push(T key) {
        linkedList.push(key);
    }

    public void print() {
        linkedList.print();
    }
}
