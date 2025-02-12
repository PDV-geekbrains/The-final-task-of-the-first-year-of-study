package OOP_Java.App.Core.DTOs;

import OOP_Java.App.Core.Enums.AnimalTypes;
import OOP_Java.App.Core.Enums.AnimalKinds;

public record AnimalShortInfoDto(
                AnimalTypes animalType,
                AnimalKinds animalKind,
                String name,
                String birthDate) {
}
