package OOP_Java.App.Core;

import java.util.Date;
import java.util.List;

import OOP_Java.App.Core.Enums.AnimalTypes;
import OOP_Java.App.Core.Enums.AnimalKinds;

public class PackAnimal extends Animal {
    private AnimalKinds packAnimalKind;
    private Date birthDate;
    private int loadCapacity;

    /**
     * Constructor.
     * 
     * @param animalKind Kind of pack animal.
     * @param name       Animal name.
     */
    public PackAnimal(AnimalKinds animalKind) {
        super(AnimalTypes.PACK_ANIMAL);
        this.packAnimalKind = animalKind;
    }

    /** Get kind of the pack animal. */
    public String GetPackAnimalKind() {
        return this.packAnimalKind.toString();
    }

    /** Get the pack animal birth date. */
    public Date GetBirthDate() {
        return this.birthDate;
    }

    /** Set the pack animal birth date. */
    public void SetBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /** Get the pack animal load capacity in kilograms. */
    public int GetLoadCapacity() {
        return this.loadCapacity;
    }

    /** Set the pack animal load capacity in kilograms. */
    public void SetLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
