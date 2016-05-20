package basicTypes;

/**
 * Created by Robert on 06.05.2016.
 */
public class Planet {
    String PlanetName;
    String MethodDetect;
    double OrbitalPeriod;
    double OrbitSemiMajorAxis;
    double PlanetRadiusJup;

    public Planet(){

    }

    public Planet(String planetName, String methodDetect, double orbitalPeriod, double orbitSemiMajorAxis, double planetRadiusJup) {
        PlanetName = planetName;
        MethodDetect = methodDetect;
        OrbitalPeriod = orbitalPeriod;
        OrbitSemiMajorAxis = orbitSemiMajorAxis;
        PlanetRadiusJup  = planetRadiusJup;

    }
}
