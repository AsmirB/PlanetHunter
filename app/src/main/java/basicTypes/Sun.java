package basicTypes;

/**
 * Created by Robert on 06.05.2016.
 */
public class Sun {

    public String Name;
    public double StellarMass;
    public double StellarRadius;
    public double Temp;

    public Sun(){
    }
    // TODO basic information more would be better
    public Sun(String name, double stellarmass, double temp, double stellarradius) {
        Name = name;
        StellarMass = stellarmass;
        Temp = temp;
        StellarRadius = stellarradius;
    }
}
