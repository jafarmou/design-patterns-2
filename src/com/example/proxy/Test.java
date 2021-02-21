package com.example.proxy;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Library library = new Library();
        String[] names = {"a", "b", "c"};
        Arrays.stream(names).forEach(name -> library.add(new EbookProxy(name)));

        library.openEbook("a");
        library.openEbook("b");
    }
}
