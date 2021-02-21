package com.example.observer;

public class DataSource extends Subject {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        notifyAllObservers();
    }
}
