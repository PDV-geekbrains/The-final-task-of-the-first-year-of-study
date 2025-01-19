package OOP_Java.App.Core;

public class Camel extends PackAnimal {
    private int withoutWaterPeriod;

    /**
     * Constructor.
     * 
     * @param name               Camel name.
     * @param withoutWaterPeriod Period in days the camel can do without water.
     */
    public Camel(
            String name,
            int withoutWaterPeriod) {
        super(name);
        super.SetPackAnimalKind("Camel");
        this.withoutWaterPeriod = withoutWaterPeriod;
    }

    /** Get period in days the camel can do without water */
    public int GetWithoutWaterPeriod() {
        return this.withoutWaterPeriod;
    }

    /** Set period in days the camel can do without water */
    public void SetWithoutWaterPeriod(int withoutWaterPeriod) {
        this.withoutWaterPeriod = withoutWaterPeriod;
    }
}
