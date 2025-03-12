package OOP_Java.App.Models.DTOs;

import OOP_Java.App.Models.Enums.AnimalKinds;
import OOP_Java.App.Models.Enums.AnimalTypes;

public record AnimalShortInfoDto(
        AnimalTypes animalType,
        AnimalKinds animalKind,
        String name,
        String birthDate) {
}
