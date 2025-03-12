package OOP_Java.App.Models;

import OOP_Java.App.Models.DTOs.AnimalShortInfoDto;
import OOP_Java.App.Models.Enums.AnimalKinds;
import OOP_Java.App.Models.Enums.AnimalTypes;

/**
 * Class describes an animal.
 */
public abstract class Animal implements Comparable<Animal> {

    public abstract AnimalTypes GetAnimalType();

    public abstract AnimalKinds GetAnimalKind();

    public abstract float GetWeight();

    public abstract Animal SetWeight(float animalWeight);

    public abstract String GetBirthDate();

    /** Returns full info about the animal. */
    public abstract Object GetFullInfo();

    /** Returns short info about the animal. */
    public abstract AnimalShortInfoDto GetShortInfo();

    /** Animals comparator. */
    public abstract int compareTo(Animal animal);
}