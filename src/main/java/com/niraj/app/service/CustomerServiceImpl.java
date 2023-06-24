package com.niraj.app.service;

import com.niraj.app.entity.Customer;
import com.niraj.app.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    public List<Customer> allCustomer(){
        return (List<Customer>) customerRepository.findAll();
    }

    @Autowired
    public Customer saveCustomer(Customer customer){
        System.out.println("Starting saveCustomer()....");
        return customerRepository.save(customer);
    }

    @Autowired
    public Customer getCustomerByCustomerId(String customerId){
        return customerRepository.findById(Long.parseLong(customerId)).orElse(null);
    }

    @Autowired
    public Customer getCustomerByCustomerName(String customerName){
        return allCustomer()
                    .stream()
                    .filter(customer -> (customerName.equalsIgnoreCase(customer.getFirstName())
                                        || customerName.equalsIgnoreCase(customer.getSecondName())
                                        || customerName.equalsIgnoreCase(customer.getLastName()) ))
                    .collect(Collectors.toList())
                    .stream()
                    .findAny().orElse(null);
    }
}
