package OOP_Java.App.Core;

import java.util.LinkedList;

import OOP_Java.App.Core.DTOs.DogFullInfoDto;
import OOP_Java.App.Core.DTOs.AnimalShortInfoDto;
import OOP_Java.App.Core.Enums.AnimalKinds;
import OOP_Java.App.Core.Enums.AnimalTypes;
import OOP_Java.App.Core.Enums.DogTrackingDegrees;
import OOP_Java.App.Core.Interfaces.IDomesticatedAnimal;

public class Dog extends Pet implements IDomesticatedAnimal {
    private static final AnimalKinds petKind = AnimalKinds.DOG;
    private int weight;
    private String ownerHomeAddress;
    private String name;
    private String birthDate;
    private LinkedList<String> commands = new LinkedList<>();
    private DogTrackingDegrees trackingDegree;

    /** Constructor. */
    public Dog(
            String name,
            String birthDate,
            String ownerHomeAddress) {
        this.name = name;
        this.birthDate = birthDate;
        this.ownerHomeAddress = ownerHomeAddress;
    }

    /** Animal type dog belongs to getter. */
    @Override
    public AnimalTypes GetAnimalType() {
        return super.GetAnimalType();
    }

    /** Weight getter. */
    @Override
    public int GetWeight() {
        return this.weight;
    }

    /** Weight setter. */
    @Override
    public void SetWeight(int weight) {
        this.weight = weight;
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
    public void SetOwnerHomeAddress(String address) {
        this.ownerHomeAddress = address;
    }

    /** Dog name getter. */
    public String GetName() {
        return this.name;
    }

    /** Dog name setter. */
    public void SetName(String name) {
        this.name = name;
    }

    /** Dod birth date getter. */
    public String GetBirthDate() {
        return this.birthDate;
    }

    /** Dog birth date setter. */
    public void SetBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /** Commands the dog knows getter. */
    public LinkedList<String> GetCommands() {
        return this.commands;
    }

    /** Command the dog knows setter. */
    public void SetCommand(String command) {
        this.commands.add(command);
    }

    /** Dog tracking degree getter. */
    public DogTrackingDegrees GetTrackingDegree() {
        return this.trackingDegree;
    }

    /** Dog tracking degree setter. */
    public void SetTrackingDegree(DogTrackingDegrees trackingDegree) {
        this.trackingDegree = trackingDegree;
    }
}
