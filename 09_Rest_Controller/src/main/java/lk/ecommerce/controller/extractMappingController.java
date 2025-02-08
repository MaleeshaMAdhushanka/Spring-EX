package lk.ecommerce.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("extract")
public class extractMappingController {

    @GetMapping("test1")
    public String extractMapping(){
        return "GET Mapping invoked";
    }

    @GetMapping("test2")
    public String extractMapping2(){
        return "GET Mapping invoked";
    }

    @GetMapping("test2/example/1234")
    public String extractMapping3(){
        return "GET Mapping invoked";
    }

}
