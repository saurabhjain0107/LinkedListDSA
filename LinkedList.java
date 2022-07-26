package com.bridgelabz.datastructure;

public class LinkedList<T> {


    Node<T> head;
    Node<T> tail;

    public void push(T key) {
        Node<T> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void add(T key) {
        Node<T> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public T pop() {
        T deletedata = head.data;
        head = head.next;
        return deletedata;
    }

    public T remove() {
        T deletedata = tail.data;
        ;
        Node<T> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        temp = tail;
        return deletedata;
    }

    public Node<T> search(T searchdata) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(searchdata))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public boolean insertafter(T searchdata, T insertafter) {
        Node<T> newNode = new Node<>(insertafter);
        Node<T> searchedNode = search(searchdata);
        if(searchedNode!=null){
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
            return true;
        }
        return false;
    }
}
