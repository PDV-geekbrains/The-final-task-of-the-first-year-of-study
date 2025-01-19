package OOP_Java.App.Core;

public class Horse extends PackAnimal {
    private int maxSpeed;

    /**
     * Constructor.
     * 
     * @param name     Horse name.
     * @param maxSpeed Horse maximum speed in km/h.
     */
    public Horse(
            String name,
            int maxSpeed) {
        super(name);
        super.SetPackAnimalKind("Horse");
        this.maxSpeed = maxSpeed;
    }

    /** Get maximum horse speed in km/h. */
    public int GetMaxSpeed() {
        return this.maxSpeed;
    }

    /** Set maximum horse speed in km/h. */
    public void SetMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
