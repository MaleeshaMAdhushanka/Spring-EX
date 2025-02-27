package lk.ecommerce.z13_springboot.service;

import lk.ecommerce.z13_springboot.dto.CustomerDTO;
import lk.ecommerce.z13_springboot.entity.Customer;
import org.modelmapper.TypeToken;

import java.util.List;

public interface CustomerService {
     void save(CustomerDTO customerDTO);

    List<CustomerDTO> getAll();

    void update(CustomerDTO customerDTO);

     void delete(int id);
}
