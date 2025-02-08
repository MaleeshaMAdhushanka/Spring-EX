package lk.ecommerce.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("params")
public class ParamsController {

    //required = false kiyala demmahama Aniwarya nh
//    http://localhost:8080/09_Rest_Controller_Web_exploded/params?id    //using true - http://localhost:8080/09_Rest_Controller_Web_exploded/params?id=I001
    @GetMapping(params = {"id"})
    public String test1(@RequestParam (value = "id", required = false) String id){
        return id;
    }

//    http://localhost:8080/09_Rest_Controller_Web_exploded/params?id=I001&name=Sudath
    @GetMapping(params = {"id", "name"})
    public String test2(@RequestParam(value = "id", required = false) String id,
                        @RequestParam(value = "name") String name){
        return id + " " + name;
    }


}
