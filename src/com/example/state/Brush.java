package com.example.state;

public class Brush implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Drawing line");
    }
}
