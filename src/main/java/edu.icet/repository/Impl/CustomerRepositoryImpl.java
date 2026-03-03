package edu.icet.repository.Impl;

import edu.icet.model.Customer;
import edu.icet.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> getAll() {
        return List.of();
    }

    @Override
    public boolean addCustomer(Customer customer) {
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return false;
    }

    @Override
    public boolean deleteCustomer(String id) {
        return false;
    }

    @Override
    public Customer serchById(String id) {
        return null;
    }
}
