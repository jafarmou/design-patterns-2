package com.example.observer;

public class Test {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        Chart chart = new Chart();
        SpreadSheet spreadSheet = new SpreadSheet();

        dataSource.addObserver(chart);
        dataSource.addObserver(spreadSheet);
        dataSource.setValue("1st msg");
        dataSource.setValue("2nd msg");
        dataSource.removeObserver(chart);
        dataSource.setValue("3rd msg");
    }
}
