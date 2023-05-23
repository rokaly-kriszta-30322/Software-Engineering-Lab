package isp.lab4.exercise1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        // Create an Order
        Order order = new Order("123456", LocalDateTime.now(), 0.0);

        // Create some Products
        Product product1 = new Product("P1", "Product 1", 10, ProductCategory.ELECTRONICS, order);
        Product product2 = new Product("P2", "Product 2", 20, ProductCategory.FASHION, order);
        Product product3 = new Product("P3", "Product 3", 8, ProductCategory.HOME_AND_GARDEN, order);

        // Add the Products to a list
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        // Calculate the total price of the Order
        double totalPrice = 0.0;
        for (Product product : productList) {
            totalPrice += product.getPrice();
        }
        order.setTotalPrice(totalPrice);

        // Print the Order details
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Date: " + order.getDate());
        System.out.println("Total Price: $" + order.getTotalPrice());

        // Print the details of each Product
        System.out.println("\nProduct List:");
        for (Product product : productList) {
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: $" + product.getPrice());
            System.out.println("Category: " + product.getProductCategory());
            System.out.println();
        }
    }
}
