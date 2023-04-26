package isp.lab4.exercise1;

public class Product {

    private String productId;
    private String name;
    private double price;
    private ProductCategory productCategory;
    private Customer customer;

    public Product (String productId, String name, double price, ProductCategory productCategory, Customer customer) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
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

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
    }
}
