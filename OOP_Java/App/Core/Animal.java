package OOP_Java.App.Core;

public abstract class Animal {
    private String animalType;
    private int weight;

    /** Returns animal type. */
    public String GetAnimalType() {
        return this.animalType;
    }

    /** Sets animal type. */
    public void SetAnimalType(String animalType) {
        this.animalType = animalType;
    }

    /** Gets animal weight. */
    public int GetWeight() {
        return this.weight;
    }

    /** Sets animal weight in kilograms. */
    public void SetWeight(int animalWeight) {
        this.weight = animalWeight;
    }
}