package aut.isp.lab4.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AquariumControllerTest {
    @Test
    public void testToString() {
        AquariumController a = new AquariumController();
        a.setModel("Unique");
        a.setManufacturer("Me");
        a.setCurrentTime(3.1f);
        String actual = a.toString();
        String expected = "Model: Unique Manufacturer: Me Current Time 3.1";

        assertEquals(expected,actual);
    }
}
