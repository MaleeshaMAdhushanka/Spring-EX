package lk.ecommerce.z13_springboot.service.impl;

import lk.ecommerce.z13_springboot.dto.OrderDTO;
import lk.ecommerce.z13_springboot.entity.Item;
import lk.ecommerce.z13_springboot.entity.Order;
import lk.ecommerce.z13_springboot.entity.OrderDetail;
import lk.ecommerce.z13_springboot.repo.CustomerRepo;
import lk.ecommerce.z13_springboot.repo.ItemRepo;
import lk.ecommerce.z13_springboot.repo.OrderRepo;
import lk.ecommerce.z13_springboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private ItemRepo itemRepo;

    @Autowired
   private OrderRepo orderRepo;

    @Transactional
    @Override
    public void placeOrder(OrderDTO orderDTO) {
        Order order = new Order();
        order.setCustomerId(orderDTO.getCustomerId());
        order.setTotalPrice(orderDTO.getTotalPrice());

        List<OrderDetail> orderDetails = orderDTO.getOrderDetails().stream().map(orderDetailDTO -> {
            Item item = itemRepo.findById(orderDetailDTO.getItemCode())
                    .orElseThrow(() -> new RuntimeException("Item not found"));

            if (item.getQuantity() < orderDetailDTO.getQuantity()) {
                throw new RuntimeException("Not enough stock for item: " + item.getName());
            }

            item.setQuantity(item.getQuantity() - orderDetailDTO.getQuantity());
            itemRepo.save(item);

            return new OrderDetail(order, item, orderDetailDTO.getQuantity(), orderDetailDTO.getPrice());
        }).toList();

        order.setOrderDetails(orderDetails);
        orderRepo.save(order);
    }


}
