package edu.icet.service;

import edu.icet.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAll();
    boolean addCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(String id);
    Customer searchById(String id);
}
