package isp.lab3.exercise5;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private HashMap<Integer, String> product;
    private int credit;

    public VendingMachine(int credit) {
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

    public void addProduct(String name, int key){
        this.getProduct().put(key,name);
    }
    public void displayProducts(){
        for(Map.Entry<Integer, String> entry:this.getProduct().entrySet())
            System.out.println("Product name: " + entry.getValue() + " Product ID: " + entry.getKey());
    }

    public void insertCoin(int value){
       this.setCredit(this.getCredit() + value);
    }

    public String selectProduct(int id){
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

    public static void main(String[] args) {
        VendingMachine v=new VendingMachine(12);
        v.addProduct("fanta",1);
        v.addProduct("cola",2);
        v.addProduct("sprite",3);
        v.addProduct("mirinda",4);
        v.displayProducts();
        v.displayCredit();
        v.userMenu();
        v.insertCoin(10);
        System.out.println(v.selectProduct(2));
        System.out.println(v.selectProduct(6));
    }
}

