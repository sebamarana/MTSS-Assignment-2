package it.unipd.mtss;

import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class IntegerToRomanTest {

    @Test
    public void testConvertOnefromClass() {
        //Arrange
        int one = 1;
        IntegerToRoman intToroman = new IntegerToRoman();
        //Act
        String result = intToroman.convert(one);
        //Assert
        assertEquals("I", result);
    }
    @Test
    public void testConvertOne() {
        //Arrange
        int one = 1;
        //Act
        String result = IntegerToRoman.convert(one);
        //Assert
        assertEquals("I", result);
    }

    @Test
    public void testConvertFour() {
        //Arrange
        int four = 4;
        //Act
        String result = IntegerToRoman.convert(four);
        //Assert
        assertEquals("IV", result);
    }

    @Test
    public void testConvert12() {
        //Arrange
        int eleven = 12;
        //Act
        String result = IntegerToRoman.convert(eleven);
        //Assert
        assertEquals("XII", result);
    }

    @Test
    public void testConvert167() {
        //Arrange
        int num = 167;
        //Act
        String result = IntegerToRoman.convert(num);
        //Assert
        assertEquals("CLXVII", result);
    }

    @Test
    public void testConvert615() {
        //Arrange
        int num = 615;
        //Act
        String result = IntegerToRoman.convert(num);
        //Assert
        assertEquals("DCXV", result);
    }

    @Test
    public void testConvert894() {
        //Arrange
        int num = 894;
        //Act
        String result = IntegerToRoman.convert(num);
        //Assert
        assertEquals("DCCCXCIV", result);
    }

    @Test
    public void testConvert999() {
        //Arrange
        int num = 999;
        //Act
        String result = IntegerToRoman.convert(num);
        //Assert
        assertEquals("CMXCIX", result);
    }

    @Test
    public void testConvert1000() {
        //Arrange
        int num = 1000;
        //Act
        String result = IntegerToRoman.convert(num);
        //Assert
        assertEquals("M", result);
    }

    @Test(expected = InvalidParameterException.class)
    public void testConvertFailOnZero() {
        //Arrange
        int num = 0;
        //Act
        String result = IntegerToRoman.convert(num);
        //Assert
        fail();
    }

    @Test(expected = InvalidParameterException.class)
    public void testConvertFailOnNegativeNumber() {
        //Arrange
        int num = -100;
        //Act
        String result = IntegerToRoman.convert(num);
        //Assert
        fail();
    }

    @Test(expected = NullPointerException.class)
    public void testConvertFailOnNullNumber() {
        //Arrange
        Integer num = null;
        //Act
        String result = IntegerToRoman.convert(num);
        //Assert
        fail();
    }
}