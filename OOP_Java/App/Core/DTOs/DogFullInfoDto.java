package OOP_Java.App.Core.DTOs;

import java.util.LinkedList;

import OOP_Java.App.Core.Enums.AnimalTypes;
import OOP_Java.App.Core.Enums.DogTrackingDegrees;
import OOP_Java.App.Core.Enums.AnimalKinds;

public record DogFullInfoDto(
                AnimalTypes animalType,
                AnimalKinds petKind,
                int weight,
                String ownerHomeAddress,
                String name,
                String birthDate,
                LinkedList<String> commands,
                DogTrackingDegrees trackingDegree) {
}