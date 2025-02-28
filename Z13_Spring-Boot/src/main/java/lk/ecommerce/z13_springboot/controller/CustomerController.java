package lk.ecommerce.z13_springboot.controller;

import lk.ecommerce.z13_springboot.dto.CustomerDTO;
import lk.ecommerce.z13_springboot.service.impl.CustomerServiceImpl;
import lk.ecommerce.z13_springboot.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin(origins = "*")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @PostMapping(path = "save")
    public ResponseUtil saveCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.saveCustomer(customerDTO);
        return new ResponseUtil(200, "Customer Saved Successfully", null);
    }

    @GetMapping("search/{id}")
    public ResponseUtil getCustomerById(@PathVariable String id) {
        return new ResponseUtil(200, "Success", customerService.getCustomerById(id));
    }

    @PutMapping("update")
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO customerDTO) {
        try {
            customerService.updateCustomer(customerDTO);
            return new ResponseUtil(200, "Customer Updated Successfully", null);
        } catch (Exception e) {
            return new ResponseUtil(404, e.getMessage(), null);
        }
    }


    @DeleteMapping("delete/{id}")
    public ResponseUtil deleteCustomer(@PathVariable String id) {
        try {
            customerService.deleteCustomer(id);
           return new ResponseUtil(200, "Customer Deleted Successfully", null);
        } catch (RuntimeException e) {
            return new ResponseUtil(400, "Customer Not Found", null);
        }


    }

    @GetMapping("getAll")
    public ResponseUtil getAllCustomers() {
        return new ResponseUtil(200, "Retrieved Customers Successfully", customerService.getAllCustomers());
    }
}
