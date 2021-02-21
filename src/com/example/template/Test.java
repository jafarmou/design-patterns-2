package com.example.template;

public class Test {
    public static void main(String[] args) {
        Task transferMoney = new TransferMoneyTask();
        Task generateReport = new GenerateReportTask();
        transferMoney.execute();
        generateReport.execute();
    }
}
