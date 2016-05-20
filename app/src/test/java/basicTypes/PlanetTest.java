package basicTypes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Robert on 06.05.2016.
 */
public class PlanetTest {


    @Test
    public void testConstructorWithoutParameterPlanet(){
        Planet earth = new Planet();
        assertNull(earth);
    }

    @Test
    public void testConstructorWithCorrectParameterPlanet(){
        String planetName  = "Kepler-318 a";
        String methodDetect = "Transit";
        double orbitalPeriod = 14.51143000;
        double orbitSemiMajorAxis = 0.110000;
        double planetRadiusJup = 0.130;
        Planet earth = new Planet(planetName, methodDetect, orbitalPeriod, orbitSemiMajorAxis, planetRadiusJup);
        assertNotNull(earth);
    }
}