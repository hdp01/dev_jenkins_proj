package demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    Main m = new Main();

    @Test
    public void testAdd() {
        assertEquals(15, m.add(10, 5));
    }

    @Test
    public void testSub() {
        assertEquals(5, m.sub(10, 5));
    }

    @Test
    public void testMul() {
        assertEquals(50, m.mul(10, 5));
    }

    @Test
    public void testDiv() {
        assertEquals(0, m.div(10, 100));
    }
}