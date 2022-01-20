package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSqrtCeil() {
        SQRService service = new SQRService();
        int start = 200;
        int limit = 300;
        int expected = 3;
        int actual = service.sqrtCeil(start, limit);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrtCeilUnderLimit() {
        SQRService service = new SQRService();
        int start = 0;
        int limit = 20;
        int expected = 0;
        int actual = service.sqrtCeil(start, limit);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrtCeilOverLimit() {
        SQRService service = new SQRService();
        int start = 9802;
        int limit = 10000;
        int expected = 0;
        int actual = service.sqrtCeil(start, limit);
        assertEquals(expected, actual);
    }
}