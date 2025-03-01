package lk.ecommerce.z13_springboot.repository;

import lk.ecommerce.z13_springboot.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, String> {
}
