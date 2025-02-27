package lk.ecommerce.z13_springboot.advisor;

import lk.ecommerce.z13_springboot.util.ResponseUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class AppWideExceptionHandler {
    //global exception handle karanna thamai use karanne
    @ExceptionHandler(Exception.class)
    public ResponseUtil  exceptionHandler(Exception ex){
        return new ResponseUtil(500, ex.getMessage(), null);
    }
}
