package OOP_Java.App.Models;

import OOP_Java.App.Models.Enums.AnimalTypes;

/**
 * Class describes a pet animal.
 */
public abstract class Pet extends Animal {

    private static final AnimalTypes animalType = AnimalTypes.PET;

    abstract String GetOwnerHomeAddress();

    abstract Pet SetOwnerHomeAddress(String address);

    @Override
    public AnimalTypes GetAnimalType() {
        return animalType;
    }
}
