import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator myCalculator;

    @Before
    public void before(){
        myCalculator = new Calculator();
    }

    @Test
    public void canAdd(){
        myCalculator.addNumbers(2.0, 2.0);
        assertEquals(4, myCalculator.getAnswer(), 0.01);
    }

    @Test
    public void canSubtract(){
        myCalculator.subtractNumbers(10.0, 5.0);
        assertEquals(5, myCalculator.getAnswer(), 0.01);
    }

    @Test
    public void canMultiply(){
        myCalculator.multiplyNumbers(6.0, 2.0);
        assertEquals(12, myCalculator.getAnswer(), 0.01);
    }

    @Test
    public void canDivide(){
        myCalculator.divideNumbers(3.0, 3.0);
        assertEquals(1, myCalculator.getAnswer(), 0.01);
    }

}
