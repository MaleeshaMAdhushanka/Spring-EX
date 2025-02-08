package lk.ecommerce.controller;

import lk.ecommerce.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JsonController {

    @PostMapping
    public String test1(@RequestBody CustomerDTO customerDTO){
//        return customerDTO.getFirstName();

        return customerDTO.getFirstName() + customerDTO.getLastName() + " " + customerDTO.getAge();
    }

    //return karana eka mark down kara
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public CustomerDTO test2(){
        return  new CustomerDTO("Kavindu", "Lakshitha", 22);
    }

    @GetMapping(value = "data", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<CustomerDTO> test3(){
        ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();
        customerDTOS.add(new CustomerDTO("linula", "Lakshitha", 22));
        customerDTOS.add(new CustomerDTO("sadasi", "dehansi", 22));
        customerDTOS.add(new CustomerDTO("rohitha", "sanjaya", 24));
        return customerDTOS;
    }

}
