package aut.isp.lab4.exercise1;

import aut.isp.lab4.exercise3.FishFeeder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise3Test {

    @Test
    public void testToString() {
        AquariumController a = new AquariumController();
        a.setModel("Unique");
        a.setManufacturer("Me");
        a.setCurrentTime(3.1f);
        String actual = a.toString();
        String expected = "Model: Unique Manufacturer: Me Current Time 3.1";

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentTime(){
        FishFeeder f = new FishFeeder();
        f.setMeals(5);

        aut.isp.lab4.exercise3.AquariumController a = new aut.isp.lab4.exercise3.AquariumController();
        a.setFeedingTime(10.0f);
        a.setFeeder(f);
        a.setCurrentTime(10.0f);
        int actual = f.getMeals();
        int expected = 4;
        assertEquals(expected, actual);
    }

}
