package lk.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//Using view returns
@Controller
@RequestMapping("test")
public class TestController {


//    Handler method, Mapping method
    @GetMapping
    public String text(){
//        return "test";
        return "index";
    }
}
