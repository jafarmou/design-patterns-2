package com.example.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();
 //   private Iterator iterator;

    public void push(String url) {
        urls.add(url);
    }
//    public String pop() {
//        var lastUrl = urls.get(urls.size() - 1);
//        urls.remove(lastUrl);
//        return lastUrl;
//    }

    public Iterator createIterator() {
        return new ArrayIterator(urls);
    }
}
