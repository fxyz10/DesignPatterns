package com.dh.dp.class12_迭代器.v2;

public class LinkedList_<E> implements Collection_<E> {

    Node head = null;
    Node tail = null;
    private int size = 0;

    @Override
    public void add(E o) {
        Node n = new Node(o);
        if (head == null) {
            head = n;
            tail = n;
        }

        tail.next = n;
        tail = n;

        size ++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator_<E> iterator() {
        return null;
    }



    private class Node {
        private E node;
        Node next;

        public Node(E node) {
            this.node = node;
        }
    }
}
