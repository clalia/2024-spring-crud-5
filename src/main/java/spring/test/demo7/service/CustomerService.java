package spring.test.demo7.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.test.demo7.pojo.Customer;
import spring.test.demo7.repo.CustomerRepo;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }
    public List<Customer> findAll(){
        return customerRepo.findAll();
    }
    public Optional<Customer> findById(int id) {
        return customerRepo.findById(id);
    }

    public void delete(Customer customer) {
        customerRepo.delete(customer);
    }
}
    
    
