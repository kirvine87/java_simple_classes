import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle myWaterBottle;

    @Before
    public void before(){
        myWaterBottle = new WaterBottle();
    }

    @Test
    public void initialVolume(){
        assertEquals(100,  myWaterBottle.getVolume());
    }

    @Test
    public void afterDrinkVolume(){
        myWaterBottle.drink();
        assertEquals(90,  myWaterBottle.getVolume());
    }

    @Test
    public void canEmpty(){
        myWaterBottle.empty();
        assertEquals(0,  myWaterBottle.getVolume());
    }

    @Test
    public void canFill(){
        myWaterBottle.fill();
        assertEquals(100,  myWaterBottle.getVolume());
    }


}
