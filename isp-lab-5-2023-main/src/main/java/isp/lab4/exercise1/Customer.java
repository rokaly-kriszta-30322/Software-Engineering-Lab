package isp.lab4.exercise1;

public class Customer {

    private String customerId;
    private String name;
    private String phone;

    public Customer(String customerId,String name, String phone){
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCustomerId() {
        return customerId;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress(Address address) {
        return address.getCity();
    }
}
