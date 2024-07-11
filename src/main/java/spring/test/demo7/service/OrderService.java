package spring.test.demo7.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

import spring.test.demo7.repo.OrderRepo;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public Order save(Order order) {
        return orderRepo.save(order);
    }

    public List<Order> findAll() {
        return orderRepo.findAll();
    }

    public Optional<Order> findById(int id) {
        return orderRepo.findById(id);
    }

    public void delete(Order order) {
        orderRepo.delete(order);
    }
}


