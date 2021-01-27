package com.dh.dp.class12_迭代器.v1;


public class LinkedList_ implements Collection_ {
    Node head = null;
    Node tail = null;

    private int size = 0;
    @Override
    public void add(Object o) {
        Node node = new Node(o);
        node.next = null;

        if (head == null) {
            head = node;
            tail = node;
        }

        tail.next = node;
        tail = node;

        size ++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator_ iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator_{
        private Node node;
        private int currentNode = 0;

        @Override
        public boolean hasNext() {
            return currentNode < size;
        }

        @Override
        public Object next() {
            Node n;
            if (node == null)
                n = head;
            else
                n = node.next;
            node = n;
            currentNode ++;
            return n;
        }
    }

    private static class Node{
        private Object o;
        Node next;
        public Node(Object o) {
            this.o = o;
        }
    }
}
