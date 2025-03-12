package OOP_Java.App.Models.DTOs;

import java.util.LinkedList;

import OOP_Java.App.Models.Enums.AnimalCommands;
import OOP_Java.App.Models.Enums.AnimalKinds;
import OOP_Java.App.Models.Enums.AnimalTypes;
import OOP_Java.App.Models.Enums.DonkeyInsistenceDegrees;

public record DonkeyFullInfoDto(
        AnimalTypes animalType,
        AnimalKinds packAnimalKind,
        float weight,
        int loadCapacity,
        String name,
        String birthDate,
        LinkedList<AnimalCommands> commands,
        DonkeyInsistenceDegrees insistenceDegree) {
}
