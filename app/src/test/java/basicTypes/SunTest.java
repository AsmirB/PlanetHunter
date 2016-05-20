package basicTypes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Robert on 06.05.2016.
 */
public class SunTest {

    @Test
    public void testConstructorWithoutParameterSun(){
        Sun s = new Sun();
        assertNull(s);
    }

    @Test
    public void testConstructorWithCorrectParametersSun(){
        String name = "Kepler-318";
        double stellarmass = 0.78;
        double temp = 5376.00;
        double stellarradius = 0.78;
        Sun s = new Sun(name , stellarmass , temp, stellarradius );
        assertNotNull(s);
    }


}