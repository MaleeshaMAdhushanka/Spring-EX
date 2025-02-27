package lk.ecommerce.z13_springboot.service.impl;


import lk.ecommerce.z13_springboot.dto.CustomerDTO;
import lk.ecommerce.z13_springboot.entity.Customer;
import lk.ecommerce.z13_springboot.repo.CustomerRepo;
import lk.ecommerce.z13_springboot.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

//BO //service custom -property
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper modelMapper;



    public void save(CustomerDTO customerDTO){
        if (customerRepo.existsById(customerDTO.getId())) {
            throw  new RuntimeException("Customer alredy exists");
        }
        customerRepo.save(modelMapper.map(customerDTO,Customer.class));
    }

    public List<CustomerDTO> getAll(){
//        return customerRepo.findAll().stream()
//                .map(customer -> new CustomerDTO(customer.getId(), customer.getName(), customer.getAddress(), customer.getAge()))
//                .collect(Collectors.toList());

        return modelMapper.map(customerRepo.findAll(),
                new TypeToken<List<CustomerDTO>>(){}.getType());
    }

    public void update(CustomerDTO customerDTO){

        if (!customerRepo.existsById(customerDTO.getId())) {
            throw  new RuntimeException("customer does not exit");

//            Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress(), customerDTO.getAge());
        }
        customerRepo.save(modelMapper.map(customerDTO, Customer.class));

    }

    public void delete(int id){
        if (customerRepo.existsById(id)) {
            customerRepo.deleteById(id);

        }
        throw new RuntimeException("Customer does not exit");
    }




}
