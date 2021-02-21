package com.example.strategy;

public class BlackAndWhite implements Filter{
    @Override
    public void filter() {
        System.out.println("Filtering using B&W");
    }
}
