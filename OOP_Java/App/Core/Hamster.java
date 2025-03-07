package OOP_Java.App.Core;

import java.util.LinkedList;

import OOP_Java.App.Core.DTOs.AnimalShortInfoDto;
import OOP_Java.App.Core.DTOs.HamsterFullInfoDto;
import OOP_Java.App.Core.Enums.AnimalCommands;
import OOP_Java.App.Core.Enums.AnimalKinds;
import OOP_Java.App.Core.Enums.AnimalTypes;
import OOP_Java.App.Core.Interfaces.IDomesticatedAnimal;

/**
 * Class describes hamster.
 */
public class Hamster extends Pet implements IDomesticatedAnimal {
    private static final AnimalKinds petKind = AnimalKinds.HAMSTER;
    private float weight;
    private String ownerHomeAddress;
    private String name;
    private String birthDate;
    private LinkedList<AnimalCommands> commands = new LinkedList<>();
    private float storedFeedAmount;

    /** Constructor. */
    public Hamster() {
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
    public Hamster SetWeight(float weight) {
        this.weight = weight;
        return this;
    }

    /** Full info getter. */
    @Override
    public HamsterFullInfoDto GetFullInfo() {
        return new HamsterFullInfoDto(
                super.GetAnimalType(),
                petKind,
                this.weight,
                this.ownerHomeAddress,
                this.name,
                this.birthDate,
                this.commands,
                this.storedFeedAmount);
    }

    /** Short info getter. */
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
    public Hamster SetOwnerHomeAddress(String address) {
        this.ownerHomeAddress = address;
        return this;
    }

    /** Name getter. */
    public String GetName() {
        return this.name;
    }

    /** Name setter. */
    public Hamster SetName(String name) {
        this.name = name;
        return this;
    }

    /** Birth date getter. */
    @Override
    public String GetBirthDate() {
        return this.birthDate;
    }

    /** Birth date setter. */
    public Hamster SetBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /** Commands getter. */
    public LinkedList<AnimalCommands> GetCommands() {
        return this.commands;
    }

    /** Command setter. */
    public Hamster SetCommand(AnimalCommands command) {
        this.commands.add(command);
        return this;
    }

    /** Hamster stored feed amount getter. */
    public float GetStoredFeedAmount() {
        return this.storedFeedAmount;
    }

    /** Hamster stored feed amount setter. */
    public Hamster SetStoredFeedAmount(float storedFeedAmount) {
        this.storedFeedAmount = storedFeedAmount;
        return this;
    }

    /** Compares animals by birth day. */
    @Override
    public int compareTo(Animal animal) {
        return this.birthDate.compareTo(animal.GetBirthDate());
    }
}
