package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSqrtCeil() {
        SQRService service = new SQRService();
        int start = 200;
        int limit = 300;
        int expected = 15;
        int actual = service.sqrtCeil(start,limit);
        assertEquals(expected , actual);
    }
}