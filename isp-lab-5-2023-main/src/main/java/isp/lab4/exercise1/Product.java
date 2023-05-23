package isp.lab4.exercise1;

public class Product {

    private String productId;
    private String name;
    private double price;
    private ProductCategory productCategory;
    private Order order;

    public Product(String productId, String name, double price, ProductCategory productCategory, Order order) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public String getProductId() {
        return productId;
    }

    public String getCustomer(Customer customer) {
        return customer.getName();
    }
}
