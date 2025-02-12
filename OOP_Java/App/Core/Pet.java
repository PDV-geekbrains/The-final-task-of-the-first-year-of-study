package OOP_Java.App.Core;

import OOP_Java.App.Core.Enums.AnimalTypes;

public abstract class Pet extends Animal {

    private static final AnimalTypes animalType = AnimalTypes.PET;

    abstract String GetOwnerHomeAddress();

    abstract void SetOwnerHomeAddress(String address);

    @Override
    public AnimalTypes GetAnimalType() {
        return animalType;
    }
}
