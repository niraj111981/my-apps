package com.niraj.app.service;

import com.niraj.app.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> allCustomer();

    Customer saveCustomer(Customer customer);

    Customer getCustomerByCustomerId(String customerId);

    Customer getCustomerByCustomerName(String customerName);
}


