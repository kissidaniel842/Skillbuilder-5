
/**
 *
 * @(Daniel Kissi)
 * @version (0.1)
 */
public class Grok
{
    // Static field that represents the default power level for all Grok objects
    private static final int DEFAULT_POWER_LEVEL = 50;

    // Instance field for the power level of the Grok
    private int powerLevel;


    public Grok() {
        this.powerLevel = DEFAULT_POWER_LEVEL;
    }


    public Grok(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getPowerLevel() {
        return powerLevel;
    }


    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }


    public void takePowerPill(PowerPill pill) {
        this.powerLevel += pill.getPower();
    }

    public void tookHit() {
        this.powerLevel -= 5;
    }
}