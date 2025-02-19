package lk.ecommerce.repository;

import lk.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

//Query implementation
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
