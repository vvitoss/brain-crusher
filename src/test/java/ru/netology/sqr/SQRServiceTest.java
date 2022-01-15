package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void countingNumSquare() {
        SQRService SQRService = new SQRService();
        int expected = 3;
        int actual = SQRService.countingNumSquare(200 , 300 );
        assertEquals(expected ,actual);
    }
}