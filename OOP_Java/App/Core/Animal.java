package OOP_Java.App.Core;

import OOP_Java.App.Core.DTOs.AnimalShortInfoDto;
import OOP_Java.App.Core.Enums.AnimalTypes;

public abstract class Animal {
    public abstract AnimalTypes GetAnimalType();

    public abstract int GetWeight();

    public abstract void SetWeight(int animalWeight);

    /** Returns full info about the animal. */
    public abstract Object GetFullInfo();

    /** Returns short info about the animal. */
    public abstract AnimalShortInfoDto GetShortInfo();
}