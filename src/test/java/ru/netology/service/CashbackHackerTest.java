package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {
    @Test
    public void calculateCash900() {
        CashbackHacker service = new CashbackHacker();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateCash100() {
        CashbackHacker service = new CashbackHacker();
        int amount = 100;

        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateCash0() {
        CashbackHacker service = new CashbackHacker();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateCash1500() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }


    @Test
    public void calculateCash1000() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }


}