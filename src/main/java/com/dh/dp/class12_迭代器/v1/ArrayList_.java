package com.dh.dp.class12_迭代器.v1;

public class ArrayList_ implements Collection_ {
    Object[] objects = new Object[10];
    private int index = 0;
    @Override
    public void add(Object o) {
        if (index == objects.length) {
            Object[] newObjects = new Object[index << 1];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = o;
        index ++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator_ iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator_ {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < index;
        }

        @Override
        public Object next() {
            Object o = objects[currentIndex];
            currentIndex ++;
            return o;
        }
    }

}
