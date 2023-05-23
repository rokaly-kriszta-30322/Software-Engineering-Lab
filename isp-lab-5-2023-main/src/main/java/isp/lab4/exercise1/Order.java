package isp.lab4.exercise1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private String orderId;
    private LocalDateTime date;
    private double totalPrice;

    public Order(String orderId, LocalDateTime date, double totalPrice) {
        this.orderId = orderId;
        this.date = date;
        this.totalPrice = 0.0;
    }

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
