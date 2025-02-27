package lk.ecommerce.z13_springboot.service;

import lk.ecommerce.z13_springboot.dto.OrderDTO;

public interface OrderService {
    void placeOrder(OrderDTO orderDTO);
}
