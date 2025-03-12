package OOP_Java.App.Models;

import OOP_Java.App.Models.Enums.AnimalTypes;

/**
 * Class describes a pack animal.
 */
public abstract class PackAnimal extends Animal {

    private static final AnimalTypes animalType = AnimalTypes.PACK_ANIMAL;

    abstract int GetLoadCapacity();

    abstract PackAnimal SetLoadCapacity(int loadCapacity);

    @Override
    public AnimalTypes GetAnimalType() {
        return animalType;
    }
}