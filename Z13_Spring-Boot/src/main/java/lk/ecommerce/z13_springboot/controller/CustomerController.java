package lk.ecommerce.z13_springboot.controller;


import lk.ecommerce.z13_springboot.dto.CustomerDTO;
import lk.ecommerce.z13_springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:63342")
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "save")
    public boolean getCustomer(@RequestBody CustomerDTO customerDTO){
      boolean res =  customerService.save(customerDTO);
        System.out.println(customerDTO.getName());
        return res;
    }

    @GetMapping(path = "getAll")
    public List<CustomerDTO> getAllCustomer(){
        return customerService.getAll();
    }


    @PutMapping(path = "update")
    public boolean updateCustomer(@RequestBody CustomerDTO customerDTO){
       return customerService.update(customerDTO);
    }

    @DeleteMapping(path = "delete")
    public boolean deleteCustomer(@RequestParam int id){
        return customerService.delete(id);
    }


}
