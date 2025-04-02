/**
 * This class defines how power pills behave in
 * a game. The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    private static final int default_power = 10;

    // instance variables
    private int power;
    private String name;

    // constructors

    public PowerPill(String name) {
        this.name = name;
        this.power = default_power;
    }

    public PowerPill(String name, int power) {
        this.name = name;
        this.power = power;
    }

    // accessor methods

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    // mutator methods

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // toString method

    @Override
    public String toString() {
        return "PowerPill " + name + " = " + power;
    }

}
