package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"square inside range ,200,300,3",
           "square under range,100,199,5",
           "square over range,301,400,3",
           "zero range,0,0,0",
           "interval border square number,225,225,1",
           "invalid range,225,225,1"})
    public void countingNumSquare(String testName, int loverRange, int upperRange, int expected){

        SQRService service = new SQRService();
        int actual = service.countingNumSquare(testName,loverRange, upperRange);
        assertEquals(expected, actual);
    }
}

