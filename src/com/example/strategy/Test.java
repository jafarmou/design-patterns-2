package com.example.strategy;

public class Test {
    public static void main(String[] args) {
        Filter bw = new BlackAndWhite();
        Filter hc = new HighContrast();
        Compressor jpg = new JpgCompressor();

        ImageStore imageStore = new ImageStore(jpg, bw);
        imageStore.store();
        ImageStore imageStore2 = new ImageStore(jpg, hc);
        imageStore2.store();
    }
}
