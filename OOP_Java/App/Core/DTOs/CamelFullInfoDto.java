package OOP_Java.App.Core.DTOs;

import java.util.LinkedList;

import OOP_Java.App.Core.Enums.AnimalCommands;
import OOP_Java.App.Core.Enums.AnimalKinds;
import OOP_Java.App.Core.Enums.AnimalTypes;

public record CamelFullInfoDto(
        AnimalTypes animalType,
        AnimalKinds petKind,
        float weight,
        int loadCapacity,
        String name,
        String birthDate,
        LinkedList<AnimalCommands> commands,
        int withoutWaterPeriod) {
}
