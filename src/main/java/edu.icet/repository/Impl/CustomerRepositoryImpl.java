package edu.icet.repository.Impl;

import edu.icet.model.Customer;
import edu.icet.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Customer> getAll() {
        String sql = "SELECT * FROM customer";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Customer(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDate(4),
                        rs.getDouble(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)
                )
        );
    }

    @Override
    public boolean addCustomer(Customer customer) {
        String sql = "INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,
                customer.getId(),
                customer.getTitle(),
                customer.getName(),
                customer.getDob(),
                customer.getSalary(),
                customer.getAddress(),
                customer.getCity(),
                customer.getProvince(),
                customer.getPostalCode()
        ) > 0;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        String sql = "UPDATE customer SET CustTitle=?, CustName=?, DOB=?,salary=?, CustAddress=?, City=?, Province=?, PostalCode=? WHERE CustID=?";

        return jdbcTemplate.update(sql,
                customer.getTitle(),
                customer.getName(),
                customer.getDob(),
                customer.getSalary(),
                customer.getAddress(),
                customer.getCity(),
                customer.getProvince(),
                customer.getPostalCode(),
                customer.getId()
        )>0;

    }

    @Override
    public boolean deleteCustomer(String id) {
        String sql = "DELETE FROM customer WHERE CustID=?";
        return jdbcTemplate.update(sql,id)>0;
    }

    @Override
    public Customer serchById(String id) {
        String sql = "SELECT * FROM customer WHERE CustID=?";

        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new Customer(
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getDate(4),
                rs.getDouble(5),
                rs.getString(6),
                rs.getString(7),
                rs.getString(8),
                rs.getString(9)
        ), id);

    }

}

