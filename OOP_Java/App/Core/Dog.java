package OOP_Java.App.Core;

import java.util.LinkedList;

import OOP_Java.App.Core.DTOs.DogFullInfoDto;
import OOP_Java.App.Core.DTOs.AnimalShortInfoDto;
import OOP_Java.App.Core.Enums.AnimalCommands;
import OOP_Java.App.Core.Enums.AnimalKinds;
import OOP_Java.App.Core.Enums.AnimalTypes;
import OOP_Java.App.Core.Enums.DogTrackingDegrees;
import OOP_Java.App.Core.Interfaces.IDomesticatedAnimal;

/**
 * Class describes dog.
 */
public class Dog extends Pet implements IDomesticatedAnimal {
    private static final AnimalKinds petKind = AnimalKinds.DOG;
    private float weight;
    private String ownerHomeAddress;
    private String name;
    private String birthDate;
    private LinkedList<AnimalCommands> commands = new LinkedList<>();
    private DogTrackingDegrees trackingDegree;

    /** Constructor. */
    public Dog() {
    }

    /** Constructor. */
    public Dog(String ownerHomeAddress) {
        this.ownerHomeAddress = ownerHomeAddress;
    }

    /** Animal type getter. */
    @Override
    public AnimalTypes GetAnimalType() {
        return super.GetAnimalType();
    }

    /** Animal king getter. */
    @Override
    public AnimalKinds GetAnimalKind() {
        return petKind;
    }

    /** Weight getter. */
    @Override
    public float GetWeight() {
        return this.weight;
    }

    /** Weight setter. */
    @Override
    public Dog SetWeight(float weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public DogFullInfoDto GetFullInfo() {
        return new DogFullInfoDto(
                super.GetAnimalType(),
                petKind,
                this.weight,
                this.ownerHomeAddress,
                this.name,
                this.birthDate,
                this.commands,
                this.trackingDegree);
    }

    @Override
    public AnimalShortInfoDto GetShortInfo() {
        return new AnimalShortInfoDto(
                super.GetAnimalType(),
                petKind,
                this.name,
                this.birthDate);
    }

    /** Owner home address getter. */
    @Override
    public String GetOwnerHomeAddress() {
        return this.ownerHomeAddress;
    }

    /** Owner home address setter. */
    @Override
    public Dog SetOwnerHomeAddress(String address) {
        this.ownerHomeAddress = address;
        return this;
    }

    /** Dog name getter. */
    public String GetName() {
        return this.name;
    }

    /** Dog name setter. */
    public Dog SetName(String name) {
        this.name = name;
        return this;
    }

    /** Dod birth date getter. */
    @Override
    public String GetBirthDate() {
        return this.birthDate;
    }

    /** Dog birth date setter. */
    public Dog SetBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /** Commands the dog knows getter. */
    public LinkedList<AnimalCommands> GetCommands() {
        return this.commands;
    }

    /** Command the dog knows setter. */
    public Dog SetCommand(AnimalCommands command) {
        this.commands.add(command);
        return this;
    }

    /** Dog tracking degree getter. */
    public DogTrackingDegrees GetTrackingDegree() {
        return this.trackingDegree;
    }

    /** Dog tracking degree setter. */
    public Dog SetTrackingDegree(DogTrackingDegrees trackingDegree) {
        this.trackingDegree = trackingDegree;
        return this;
    }

    /** Compares animals by birth day. */
    @Override
    public int compareTo(Animal animal) {
        return this.birthDate.compareTo(animal.GetBirthDate());
    }
}
