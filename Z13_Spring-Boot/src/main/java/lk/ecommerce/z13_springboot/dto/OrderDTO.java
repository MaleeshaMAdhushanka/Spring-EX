package lk.ecommerce.z13_springboot.dto;

import java.util.List;

public class OrderDTO {

    private String orderId;
    private String dateTime;
    private String customerId;
    private List<OrderDetailDTO> orderDetails;


    public OrderDTO() {
    }

    public OrderDTO(String orderId, String dateTime, String customerId, List<OrderDetailDTO> orderDetails) {
        this.orderId = orderId;
        this.dateTime = dateTime;
        this.customerId = customerId;
        this.orderDetails = orderDetails;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<OrderDetailDTO> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetailDTO> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
