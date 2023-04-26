package isp.lab4.exercise1;

import java.time.LocalDateTime;

public class Order {

    private String orderId;
    private LocalDateTime date;
    private double totalPrice;

    public double getTotalPrice() {
        return totalPrice;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
