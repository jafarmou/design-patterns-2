package com.example.iterator;

public interface Iterator<T> {
    void next();
    T current();
    boolean isDone();
}
