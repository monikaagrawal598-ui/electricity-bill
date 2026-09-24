package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testFor50Units() {
        assertEquals(250, App.calculateBill(50));
    }

    @Test
    void testFor100Units() {
        assertEquals(500, App.calculateBill(100));
    }

    @Test
    void testFor150Units() {
        assertEquals(850, App.calculateBill(150));
    }

    @Test
    void testFor200Units() {
        assertEquals(1200, App.calculateBill(200));
    }

    @Test
    void testFor250Units() {
        assertEquals(1700, App.calculateBill(250));
    }
}