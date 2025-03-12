package OOP_Java.App.Models.DTOs;

import java.util.LinkedList;

import OOP_Java.App.Models.Enums.AnimalCommands;
import OOP_Java.App.Models.Enums.AnimalKinds;
import OOP_Java.App.Models.Enums.AnimalTypes;

public record CamelFullInfoDto(
        AnimalTypes animalType,
        AnimalKinds packAnimalKind,
        float weight,
        int loadCapacity,
        String name,
        String birthDate,
        LinkedList<AnimalCommands> commands,
        int withoutWaterPeriod) {
}
