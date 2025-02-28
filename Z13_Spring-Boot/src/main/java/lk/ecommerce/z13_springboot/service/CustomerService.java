package lk.ecommerce.z13_springboot.service;

import lk.ecommerce.z13_springboot.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    void saveCustomer(CustomerDTO customerDTO);

    void updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(String id);

    CustomerDTO getCustomerById(String id);

    List<CustomerDTO> getAllCustomers();

}
