package lk.ecommerce.z13_springboot.repository;

import lk.ecommerce.z13_springboot.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepo extends JpaRepository<Orders, String> {
}
