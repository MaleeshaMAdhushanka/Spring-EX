package lk.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@Controller
@RequestMapping("two")
public class wildCardMappingOptionTwo {


        //one /test/*/hello medata onama value ekka gannawa
        //one /test//hello
        //one /test/asfddda/hello/asasda

        @GetMapping("test/*/*")
        public String test(){
            return "test1";
        }
}
