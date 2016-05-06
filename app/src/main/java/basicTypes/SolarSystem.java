package basicTypes;

/**
 * Created by Robert on 06.05.2016.
 */
public class SolarSystem {
    // cause Igor said -> public
    public String Name;
    public int PlanetCount;
    public String RightAscension;
    public String Declination;
    public double Distance;

    public SolarSystem(){

    }

    public SolarSystem(String name,int planetCount,String rightAscension,String declination, Double distance ){
        Name = name;
        PlanetCount = planetCount;
        RightAscension = rightAscension;
        Declination = declination;
        Distance = distance;
    }
}
