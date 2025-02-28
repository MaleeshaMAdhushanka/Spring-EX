package lk.ecommerce.z13_springboot.repository;

import lk.ecommerce.z13_springboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, String> {

}
