package isp.lab3;

import isp.lab3.example.Airplain;
import isp.lab3.exercise1.Tree;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void testGrow() {
        Tree t = new Tree(20);
        int actual = t.grow(10);
        int expected = 30;

        assertEquals(expected,actual);
    }

    @Test
    public void testGrow2() {
        Tree t = new Tree(10);
        int actual = t.grow(0);
        int expected = 10;

        assertEquals(expected,actual);


    }

    @Test
    public void testToString() {
        Tree t = new Tree(10);
        String actual = t.toString();
        String expected = "this is a tree with height 10";
        assertEquals(expected,actual);
    }
}