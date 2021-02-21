package com.example.adapter;

import com.example.adapter.avaFilters.Caramel;

public class Test {
    public static void main(String[] args) {
        ImageView view = new ImageView(new Image());
        view.apply(new VividFilter());
        view.apply(new CaramelFilter(new Caramel()));
    }
}
