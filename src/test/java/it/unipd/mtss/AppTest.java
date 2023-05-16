package it.unipd.mtss;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static RomanPrinter printer;
    private static IntegerToRoman converter;

    @BeforeClass
    public static void classSetUp() {
        printer = new RomanPrinter();
        converter = new IntegerToRoman();
    }

}
