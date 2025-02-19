package lk.ecommerce.z13_springboot.service;


import lk.ecommerce.z13_springboot.dto.CustomerDTO;
import lk.ecommerce.z13_springboot.entity.Customer;
import lk.ecommerce.z13_springboot.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

//BO //service custom -property
@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;


    public boolean save(CustomerDTO customerDTO){
        Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress());
        customerRepo.save(customer);
        return true;
    }

    public List<CustomerDTO> getAll(){
        return customerRepo.findAll().stream()
                .map(customer -> new CustomerDTO(customer.getId(), customer.getName(), customer.getAddress()))
                .collect(Collectors.toList());

    }

    public boolean update(CustomerDTO customerDTO){

        if (customerRepo.existsById(customerDTO.getId())) {
            Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress());
            customerRepo.save(customer);
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(int id){
        if (customerRepo.existsById(id)) {
            customerRepo.deleteById(id);
            return true;

        }
        return false;
    }





}
