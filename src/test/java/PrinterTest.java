import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer myPrinter;

    @Before
    public void before(){
        myPrinter = new Printer();
    }

    @Test
    public void canPrintIfEnoughPaper(){
        assertEquals(true,  myPrinter.print(1, 5));
        assertEquals(95,  myPrinter.getPaper());
        assertEquals(9,  myPrinter.getToner());
    }

}
