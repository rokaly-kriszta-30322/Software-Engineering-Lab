package isp.lab3.exercise6;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineSingleton {

    private static VendingMachineSingleton instance;
    private HashMap<Integer, String> product;
    private int credit;

    private VendingMachineSingleton(int credit) {
        this.credit = credit;
        this.product = new HashMap<Integer, String>();
    }

    public HashMap<Integer, String> getProduct() {
        return product;
    }

    public void setProduct(HashMap<Integer, String> product) {
        this.product = product;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {

        this.credit = credit;
    }

    void addProduct(String name, int key){
        this.getProduct().put(key,name);
    }
    public void displayProducts(){
        for(Map.Entry<Integer, String> entry:this.getProduct().entrySet())
            System.out.println("Product name: " + entry.getValue() + " Product ID: " + entry.getKey());
    }

    public void insertCoin(int value){
        this.setCredit(this.getCredit() + value);
    }

    String selectProduct(int id){
        if(this.getProduct().containsKey(id))
            return this.getProduct().get(id);
        else return "Error";
    }
    public void displayCredit(){
        System.out.println(getCredit());
    }
    public void userMenu(){
        System.out.println("Insert money");
    }
    public static VendingMachineSingleton getInstance() {
        if(instance == null) {
            instance = new VendingMachineSingleton(20);
        }
        return instance;
    }
}