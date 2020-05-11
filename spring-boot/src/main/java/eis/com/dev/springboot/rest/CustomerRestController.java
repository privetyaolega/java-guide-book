package eis.com.dev.springboot.rest;

import eis.com.dev.springboot.dao.CustomerDAO;
import eis.com.dev.springboot.entity.Customer;
import eis.com.dev.springboot.rest.exception.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    @Autowired
    private CustomerDAO customerDAO;
    private List<Customer> customers;

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @GetMapping("/customers/{customerId}")
    public Customer getStudentById(@PathVariable int customerId) {
        customers = customerDAO.getCustomers();
        if (customerId >= customers.size() || customerId < 0) {
            throw new StudentNotFoundException(String.format("Student %d was not found!", customerId));
        }
        return customers.get(customerId);
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer) {
        customer.setId(0);
        customerDAO.saveCustomer(customer);
        return customer;
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer customer) {
        customerDAO.saveCustomer(customer);
        return customer;
    }

    @DeleteMapping("/customers/{customerId}")
    public Customer deleteStudentById(@PathVariable int customerId) {
        if (customerId >= customers.size() || customerId < 0) {
            throw new StudentNotFoundException(String.format("Student %d was not found!", customerId));
        }
        Customer customer = customerDAO.getCustomer(customerId);
        customerDAO.deleteCustomer(customerId);
        return customer;
    }
}