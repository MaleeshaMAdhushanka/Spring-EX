package lk.ecommerce.controller;

import lk.ecommerce.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("form")
public class FormController {

    //req www url data tika object ekata daganna eka
    //  loku object ekka gaththoth expand wechcha data tikkak ewanwa nama Using model attribute
    @PostMapping
    public String test1(@ModelAttribute CustomerDTO customerDTO){
        System.out.println(customerDTO.getFirstName() + " " + customerDTO.getLastName());
        return customerDTO.toString();
    }
}
