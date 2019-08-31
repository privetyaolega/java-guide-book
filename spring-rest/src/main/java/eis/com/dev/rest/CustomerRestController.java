package eis.com.dev.rest;

import eis.com.dev.entity.Customer;
import eis.com.dev.rest.exception.StudentNotFoundException;
import eis.com.dev.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;
    private List<Customer> customers;

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("/customers/{customerId}")
    public Customer getStudentById(@PathVariable int customerId) {
        customers = customerService.getCustomers();
        if (customerId >= customers.size() || customerId < 0) {
            throw new StudentNotFoundException(String.format("Student %d was not found!", customerId));
        }
        return customers.get(customerId);
    }

}