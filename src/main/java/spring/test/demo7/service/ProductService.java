package spring.test.demo7.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.test.demo7.pojo.Product;
import spring.test.demo7.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product) {
        return productRepo.save(product);
    }

    public List<Product> findAll() {
        return productRepo.findAll();
    }

    public Optional<Product> findById(int id) {
        return productRepo.findById(id);
    }

    public void delete(Product product) {
        productRepo.delete(product);
    }
}


