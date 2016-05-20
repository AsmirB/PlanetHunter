package basicTypes;

import java.util.ArrayList;
import java.util.List;

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
    private List<Sun> SunList;
    //private List<Planet> PlanetList;

    public SolarSystem(){

    }

    public SolarSystem(String name,int planetCount,String rightAscension,String declination, Double distance ){
        Name = name;
        PlanetCount = planetCount;
        RightAscension = rightAscension;
        Declination = declination;
        Distance = distance;
        SunList = new ArrayList<Sun>();
    }

    public void addSun(Sun sun) {
        SunList.add(sun);
    }

    public Object getListOfSun() {
        return SunList;
    }

    public Object getSizeListOfSun() {
        return SunList.size();
    }
}
