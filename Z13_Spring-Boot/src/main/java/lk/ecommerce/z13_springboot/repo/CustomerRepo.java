package lk.ecommerce.z13_springboot.repo;

import lk.ecommerce.z13_springboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//DAO
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
