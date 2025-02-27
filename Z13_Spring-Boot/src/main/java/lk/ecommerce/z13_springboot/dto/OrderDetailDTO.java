package lk.ecommerce.z13_springboot.dto;

public class OrderDetailDTO {
    private int itemCode;
    private int quantity;
    private double price;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(int itemCode, int quantity, double price) {
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.price = price;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
