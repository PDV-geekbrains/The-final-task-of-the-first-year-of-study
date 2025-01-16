package OOP_Java.App.Core;

public abstract class Animal {
    private String type;
    private String kind;
    private int weight;

    /** Returns animal type. */
    public String GetAnimalType() {
        return this.type;
    }

    /** Sets animal type. */
    public void SetAnimalType(String animalType) {
        this.type = animalType;
    }

    /** Gets animal kind. */
    public String GetAnimalKind() {
        return this.kind;
    }

    /** Sets animal kind. */
    public void SetAnimalKind(String animalKind) {
        this.kind = animalKind;
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