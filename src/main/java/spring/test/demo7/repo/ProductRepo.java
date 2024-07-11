package spring.test.demo7.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.test.demo7.pojo.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
