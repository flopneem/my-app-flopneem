package spacex;
import java.util.Objects;

public class Payload {
    private String name;
    private String type;
    private double mass;
    private String orbit;

    public Payload() {

    }

    public Payload(String payload) {
        String[] attr = payload.split(",");
        this.name = attr[0];
        this.type = attr[1];
        this.mass = Double.parseDouble(attr[2]);
        this.orbit = attr[3];
    }

    public Payload(String name, String type, double mass, String orbit) {
        this.name = name;
        this.type = type;
        this.mass = mass;
        this.orbit = orbit;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the mass
     */
    public double getMass() {
        return mass;
    }

    /**
     * @param mass the mass to set
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * @return the orbit
     */
    public String getOrbit() {
        return orbit;
    }

    /**
     * @param orbit the orbit to set
     */
    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Payload load = (Payload) o;
        return Objects.equals(name, load.name)
                && Objects.equals(this.mass, load.mass)
                && Objects.equals(this.orbit, load.orbit)
                && Objects.equals(this.type, load.type);
    }

    @Override
    public String toString() {
        return  name
                + "," + type
                + "," + mass
                + "," + orbit;
    }
}
