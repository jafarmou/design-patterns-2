package com.example.iterator;

import java.util.List;

public class ArrayIterator<T> implements Iterator<T> {
    private List<T> array;
    private int index;

    public ArrayIterator(List<T> array) {
        this.array = array;
        this.index = array.size() - 1;
    }

    @Override
    public void next() {
        index--;
    }

    @Override
    public T current() {
        return array.get(index);
    }

    @Override
    public boolean isDone() {
        return !(index<0);
    }
}
