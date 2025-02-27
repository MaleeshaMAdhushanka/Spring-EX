package lk.ecommerce.z13_springboot.controller;

import lk.ecommerce.z13_springboot.dto.OrderDTO;
import lk.ecommerce.z13_springboot.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:63342")
@RestController
@RequestMapping("api/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("placeOrder")
    public ResponseUtil placeOrder(@RequestBody OrderDTO orderDTO){
        orderService.placeOrder(orderDTO);
        return new ResponseUtil(200, "Order placed successfully", null);
    }

}
