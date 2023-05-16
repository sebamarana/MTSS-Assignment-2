package it.unipd.mtss;

import org.junit.Test;
import org.junit.Before;

import java.security.InvalidParameterException;

import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

public class RomanPrinterTest {

    @Test
    public void testPrintOnefromClass() {
        //Arrange
        int number = 1;
        RomanPrinter rom = new RomanPrinter();
        //Act
        String result = rom.print(number);
        //Assert
        assertEquals("  _____  \n |_   _| \n   | |   \n   | |   \n  _| |_  \n |_____| \n", result);
    }

    @Test
    public void testPrintOne() {
        //Arrange
        String roman = "I";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("  _____  \n |_   _| \n   | |   \n   | |   \n  _| |_  \n |_____| \n", result);
    }

    @Test
    public void testPrint4() {
        //Arrange
        String roman = "IV";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("  _____   __      __ \n |_   _|  \\ \\    / / \n   | |     \\ \\  / /  \n   | |      \\ \\/ /   \n  _| |_      \\  /    \n |_____|      \\/     \n", result);
    }

    @Test
    public void testPrint5() {
        //Arrange
        String roman = "V";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals(" __      __ \n \\ \\    / / \n  \\ \\  / /  \n   \\ \\/ /   \n    \\  /    \n     \\/     \n", result);
    }

    @Test
    public void testPrint9() {
        //Arrange
        String roman = "IX";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("  _____   __   __ \n |_   _|  \\ \\ / / \n   | |     \\ V /  \n   | |      > <   \n  _| |_    / . \\  \n |_____|  /_/ \\_\\ \n", result);
    }

    @Test
    public void testPrint10() {
        //Arrange
        String roman = "X";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals(" __   __ \n \\ \\ / / \n  \\ V /  \n   > <   \n  / . \\  \n /_/ \\_\\ \n", result);
    }

    @Test
    public void testPrint40() {
        //Arrange
        String roman = "XL";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals(" __   __   _       \n \\ \\ / /  | |      \n  \\ V /   | |      \n   > <    | |      \n  / . \\   | |____  \n /_/ \\_\\  |______| \n", result);
    }

    @Test
    public void testPrint50() {
        //Arrange
        String roman = "L";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("  _       \n | |      \n | |      \n | |      \n | |____  \n |______| \n", result);
    }

    @Test
    public void testPrint90() {
        //Arrange
        String roman = "XC";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals(" __   __    _____  \n \\ \\ / /   / ____| \n  \\ V /   | |      \n   > <    | |      \n  / . \\   | |____  \n /_/ \\_\\   \\_____| \n", result);
    }

    @Test
    public void testPrint100() {
        //Arrange
        String roman = "C";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("   _____  \n  / ____| \n | |      \n | |      \n | |____  \n  \\_____| \n", result);
    }

    @Test
    public void testPrint400() {
        //Arrange
        String roman = "CD";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("   _____    _____   \n  / ____|  |  __ \\  \n | |       | |  | | \n | |       | |  | | \n | |____   | |__| | \n  \\_____|  |_____/ \n", result);
    }

    @Test
    public void testPrint500() {
        //Arrange
        String roman = "D";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("  _____   \n |  __ \\  \n | |  | | \n | |  | | \n | |__| | \n |_____/ \n", result);
    }

    @Test
    public void testPrint900() {
        //Arrange
        String roman = "CM";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("   _____    __  __  \n  / ____|  |  \\/  | \n | |       | \\  / | \n | |       | |\\/| | \n | |____   | |  | | \n  \\_____|  |_|  |_| \n", result);
    }

    @Test
    public void testPrint1000() {
        //Arrange
        String roman = "M";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("  __  __  \n |  \\/  | \n | \\  / | \n | |\\/| | \n | |  | | \n |_|  |_| \n", result);
    }

    @Test(expected = InvalidParameterException.class)
    public void testInvalidRoman() {
        //Arrange
        String roman = "XK";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        fail();
    }

    @Test(expected = InvalidParameterException.class)
    public void testEmptyString() {
        //Arrange
        String roman = "";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        fail();
    }

    @Test(expected = InvalidParameterException.class)
    public void testNullString() {
        //Arrange
        String roman = null;
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        fail();
    }
}