package lk.ecommerce.z13_springboot.service;

import lk.ecommerce.z13_springboot.dto.OrderDTO;
import lk.ecommerce.z13_springboot.dto.OrderDetailDTO;

import java.util.List;

public interface OrderService {
    void saveOrder(OrderDTO orderDTO);

    OrderDTO getOrderById(String orderId);

    List<OrderDTO> getAllOrders();

    boolean checkItemsInStock(List<OrderDetailDTO> orderDetails);
}
