package spring.test.demo7.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.test.demo7.pojo.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}


