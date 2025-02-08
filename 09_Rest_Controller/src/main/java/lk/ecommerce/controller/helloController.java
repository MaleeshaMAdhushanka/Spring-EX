package lk.ecommerce.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class helloController {
    public helloController(){
        System.out.println("Hello Controller");
    }

    @GetMapping
    public String hello(){
        return "Hello world";
    }

    @PostMapping
    public  String post(){
        return "Post Mapping";
    }

    @PutMapping
    public String put(){
        return "Put Mapping";
    }

    @DeleteMapping
    public String delete(){
        return "Delete Mapping";
    }

    @PatchMapping
    public String patch(){
        return "Patch Mapping";
    }


}
