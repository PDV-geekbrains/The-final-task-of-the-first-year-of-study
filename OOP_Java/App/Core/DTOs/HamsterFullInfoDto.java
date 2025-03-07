package OOP_Java.App.Core.DTOs;

import java.util.LinkedList;

import OOP_Java.App.Core.Enums.AnimalCommands;
import OOP_Java.App.Core.Enums.AnimalKinds;
import OOP_Java.App.Core.Enums.AnimalTypes;

public record HamsterFullInfoDto(
        AnimalTypes animalType,
        AnimalKinds petKind,
        float weight,
        String ownerHomeAddress,
        String name,
        String birthDate,
        LinkedList<AnimalCommands> commands,
        float storedFeedAmount) {
}
