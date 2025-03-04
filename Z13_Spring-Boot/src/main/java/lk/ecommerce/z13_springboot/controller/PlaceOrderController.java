package lk.ecommerce.z13_springboot.controller;

import lk.ecommerce.z13_springboot.dto.OrderDTO;
import lk.ecommerce.z13_springboot.service.OrderService;
import lk.ecommerce.z13_springboot.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/order")
@CrossOrigin("*")
public class PlaceOrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/save")
    public ResponseUtil saveOrder(@RequestBody OrderDTO orderDTO){
        orderService.saveOrder(orderDTO);
        return  new ResponseUtil(200, "Order Saved Successfully", null);
    }

    @GetMapping("/getAll")
    public ResponseUtil getAllOrders(){
        return new ResponseUtil(200, "Successfully Retrieved", orderService.getAllOrders());
    }

    @GetMapping("/search/{id}")
    public ResponseUtil getOrderById(@PathVariable String id){
        return new ResponseUtil(200, "Order founded Successfully", orderService.getOrderById(id));
    }


}
