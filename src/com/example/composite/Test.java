package com.example.composite;

public class Test {
    public static void main(String[] args) {
        var square1 = new Shape("square1");
        var square = new Shape("square");
        var circle1 = new Shape("circle1");

        Group group1 = new Group();
        group1.add(square1);
        group1.add(square);
        
        Group group2 = new Group();
        group2.add(group1);
        group2.add(circle1);

        group2.render();
    }
}
