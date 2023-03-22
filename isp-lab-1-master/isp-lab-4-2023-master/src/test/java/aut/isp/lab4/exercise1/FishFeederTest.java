package aut.isp.lab4.exercise1;

import aut.isp.lab4.exercise2.FishFeeder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FishFeederTest {

    @Test
    public void testToString() {
        FishFeeder f = new FishFeeder();
        f.setModel("Unique");
        f.setManufacturer("Me");
        f.setMeals(1);
        String actual = f.toString();
        String expected = "Model: Unique Manufacturer: Me Meals 1";

        assertEquals(expected, actual);
    }
}
