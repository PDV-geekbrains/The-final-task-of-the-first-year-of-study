package OOP_Java.App.Core;

import OOP_Java.App.Core.Enums.AnimalTypes;

public abstract class PackAnimal extends Animal {

    private static final AnimalTypes animalType = AnimalTypes.PACK_ANIMAL;

    abstract int GetLoadCapacity();

    abstract PackAnimal SetLoadCapacity(int loadCapacity);

    @Override
    public AnimalTypes GetAnimalType() {
        return animalType;
    }
}
