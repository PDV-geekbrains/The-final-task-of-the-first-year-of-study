package OOP_Java.App.Models.DTOs;

import java.util.LinkedList;

import OOP_Java.App.Models.Enums.AnimalCommands;
import OOP_Java.App.Models.Enums.AnimalKinds;
import OOP_Java.App.Models.Enums.AnimalTypes;
import OOP_Java.App.Models.Enums.CatClimbingDegrees;

public record CatFullInfoDto(
        AnimalTypes animalType,
        AnimalKinds petKind,
        float weight,
        String ownerHomeAddress,
        String name,
        String birthDate,
        LinkedList<AnimalCommands> commands,
        CatClimbingDegrees climbingDegree) {
}
