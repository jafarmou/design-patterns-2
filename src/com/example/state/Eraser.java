package com.example.state;

public class Eraser implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Eraser icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erasing something");
    }
}
