package isp.lab4.exercise1;

public class Customer {

    private String customerId;
    private String name;
    private String phone;
    private Address address;

    public Customer(String customerId,String name, String phone, Address Address){
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getPhone() {
        return phone;
    }
}
