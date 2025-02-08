package lk.ecommerce.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("variable")
public class PathVariableController {

    //-----variable/I123
//    @GetMapping(path = "{id: [I] [0-9] {3}}")
    @GetMapping(path = "{id:I[0-9]{3}}")
    public String variable1(@PathVariable("id") String id){
        return id;
    }

    //http://localhost:8080/09_Rest_Controller_Web_exploded/variable/C15

    @GetMapping(path = "{customerId}")
    public String variable2(@PathVariable("customerId") String id){
        return id;
    }

    @GetMapping(path = "{customerId}/{customerName}")
    public String variable3(@PathVariable("customerId") String id,
                            @PathVariable("customerName") String name){

        return id + " " + name;
    }


}
