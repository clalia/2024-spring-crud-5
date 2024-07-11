package spring.test.demo7.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order,Integer> {

}
