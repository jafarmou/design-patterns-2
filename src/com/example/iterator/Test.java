package com.example.iterator;

public class Test {
    public static void main(String[] args) {
        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("a.com");
        browseHistory.push("b.com");
        browseHistory.push("c.com");
        var iterator = browseHistory.createIterator();
        while (iterator.isDone()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
