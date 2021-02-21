package com.example.command;

import com.example.command.fx.Command;

public class AddCustomerCommand implements Command {
    private CustomerService service;

    public AddCustomerCommand(CustomerService customerService) {
        this.service = customerService;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
