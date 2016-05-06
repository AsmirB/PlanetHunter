package basicTypes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Robert on 06.05.2016.
 */
public class SolarSystemTest {

    @Test
    public void testConstructorSolarSystem() {
        SolarSystem s = new SolarSystem();
        assertNull(s);
    }

    @Test
    public void testWithParameterConstructorSolarSystem(){
        String name = "Kepler-389";
        String asc = "19h27m50.40s";
        String des = "+44d54m00.1s";
        double  dis = 291.960005;
        SolarSystem s = new SolarSystem(name, 3, asc, des , dis);
        assertNotNull(s);
    }

    @Test
    public void testWithWrongParameterVConstructorSolarSystem(){
        //WTF
        //SolarSystem s = new SolarSystem(1,2,3);
        //assertNull(s);

    }

}