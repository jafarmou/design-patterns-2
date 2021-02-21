package com.example.strategy;

public class JpgCompressor implements Compressor {
    @Override
    public void compress() {
        System.out.println("Compressing using JPG");
    }
}
