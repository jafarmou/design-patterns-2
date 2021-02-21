package com.example.strategy;

public class HighContrast implements Filter{
    @Override
    public void filter() {
        System.out.println("Filtering using High Contrast");
    }
}
