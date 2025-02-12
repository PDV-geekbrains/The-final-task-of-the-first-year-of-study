package OOP_Java.App.Core.DTOs;

import java.util.LinkedList;

import OOP_Java.App.Core.Enums.AnimalTypes;
import OOP_Java.App.Core.Enums.CatClimbingDegrees;
import OOP_Java.App.Core.Enums.PetKinds;

public record CatFullInfoDto(
                AnimalTypes animalType,
                PetKinds petKind,
                int weight,
                String ownerHomeAddress,
                String name,
                String birthDate,
                LinkedList<String> commands,
                CatClimbingDegrees climbingDegree) {
}
