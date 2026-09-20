package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GroceryCounterTest {

    GroceryCounter counter;

    @BeforeEach
    void setUp() {
        counter = new GroceryCounter();
    }

    @Test
    public void testStartingTotal() {
        assertEquals("$0.00", counter.total());
    }

    @Test
    public void testTens() {
        counter.tens();

        assertEquals("$10.00", counter.total());
    }

    @Test
    public void testOnes() {
        counter.ones();

        assertEquals("$1.00", counter.total());
    }

    @Test
    public void testTenths() {
        counter.tenths();

        assertEquals("$0.10", counter.total());
    }

    @Test
    public void testHundredths() {
        counter.hundredths();

        assertEquals("$0.01", counter.total());
    }

    @Test
    public void testMultipleButtons() {
        counter.tens();
        counter.tens();
        counter.ones();
        counter.tenths();
        counter.hundredths();

        assertEquals("$21.11", counter.total());
    }

    @Test
    public void testNoOverFlow() {
        counter.tens();
        counter.ones();

        assertEquals(0, counter.overFlow());
    }

    @Test
    public void testOverflow() {
        for (int i = 0; i < 100; i++) {
            counter.ones();
        }

        assertEquals("$0.00", counter.total());
        assertEquals(1, counter.overFlow());
    }

    @Test
    public void testMultipleOverFlow() {
        for (int i = 0; i < 200; i++) {
            counter.ones();
        }

        assertEquals("$0.00", counter.total());
        assertEquals(2, counter.overFlow());
    }

    @Test
    public void testClear() {
        counter.tens();
        counter.ones();
        counter.tenths();
        counter.hundredths();

        counter.reset();

        assertEquals("$0.00", counter.total());
        assertEquals(0, counter.overFlow());
    }

    @Test
    public void testClearAfterOverFlow() {
        for (int i = 0; i < 100; i++) {
            counter.ones();
        }

        counter.reset();

        assertEquals("$0.00", counter.total());
        assertEquals(0, counter.overFlow());
    }
}