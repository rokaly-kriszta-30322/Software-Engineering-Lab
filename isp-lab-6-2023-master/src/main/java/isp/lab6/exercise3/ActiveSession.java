package isp.lab6.exercise3;

import java.util.HashMap;
import java.util.Map;

public class ActiveSession {

    private String username;
    Map<String, String> shoppingCart = new HashMap();

    public void addToCart(String product, String quality){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
