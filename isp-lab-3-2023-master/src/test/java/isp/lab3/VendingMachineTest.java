package isp.lab3;

import isp.lab3.exercise5.VendingMachine;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    @Test
    public void TestDisplayProduct() {
        VendingMachine v = new VendingMachine(20);
        v.addProduct("fanta",1);
        String actual = "";
        for(Map.Entry<Integer, String> entry:v.getProduct().entrySet())
            actual+="Product name: " + entry.getValue() + " Product ID: " + entry.getKey();
        String expected = "Product name: fanta Product ID: 1";
        assertEquals(expected,actual);
    }
    @Test
    public void TestInsertCoin() {
        VendingMachine v = new VendingMachine(20);
        v.insertCoin(20);
        v.insertCoin(10);
        int actual = v.getCredit();
        int expected = 50;
        assertEquals(expected,actual);
    }
    @Test
    public void TestSelectProduct() {
        VendingMachine v = new VendingMachine(20);
        v.addProduct("fanta",1);
        String actual = "";
        actual += v.selectProduct(1);
        String expected = "fanta";
        assertEquals(expected,actual);
    }

}
