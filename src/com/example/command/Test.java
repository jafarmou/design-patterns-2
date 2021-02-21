package com.example.command;

import com.example.command.fx.Button;

public class Test {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        var command = new AddCustomerCommand(service);
        Button button = new Button(command);
        button.click();
    }
}
