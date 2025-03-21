package OOP_Java.App.Models;

import java.util.LinkedList;

import OOP_Java.App.Models.DTOs.AnimalShortInfoDto;
import OOP_Java.App.Models.DTOs.CatFullInfoDto;
import OOP_Java.App.Models.Enums.AnimalCommands;
import OOP_Java.App.Models.Enums.AnimalKinds;
import OOP_Java.App.Models.Enums.AnimalTypes;
import OOP_Java.App.Models.Enums.CatClimbingDegrees;
import OOP_Java.App.Models.Interfaces.IDomesticatedAnimal;

/**
 * Class describes a cat.
 */
public class Cat extends Pet implements IDomesticatedAnimal {
    private static final AnimalKinds petKind = AnimalKinds.CAT;
    private float weight;
    private String ownerHomeAddress;
    private String name;
    private String birthDate;
    private LinkedList<AnimalCommands> commands = new LinkedList<>();
    private CatClimbingDegrees climbingDegree;

    /** Constructor. */
    public Cat() {
    }

    /** Animal type getter. */
    @Override
    public AnimalTypes GetAnimalType() {
        return super.GetAnimalType();
    }

    /** Animal kind getter. */
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
    public Cat SetWeight(float weight) {
        this.weight = weight;
        return this;
    }

    /** Full info getter. */
    @Override
    public CatFullInfoDto GetFullInfo() {
        return new CatFullInfoDto(
                super.GetAnimalType(),
                petKind,
                this.weight,
                this.ownerHomeAddress,
                this.name,
                this.birthDate,
                this.commands,
                this.climbingDegree);
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
    public Cat SetOwnerHomeAddress(String address) {
        this.ownerHomeAddress = address;
        return this;
    }

    /** Name getter. */
    public String GetName() {
        return this.name;
    }

    /** Name setter. */
    public Cat SetName(String name) {
        this.name = name;
        return this;
    }

    /** Birth date getter. */
    @Override
    public String GetBirthDate() {
        return this.birthDate;
    }

    /** Birth date setter. */
    public Cat SetBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /** Commands the dog knows getter. */
    public LinkedList<AnimalCommands> GetCommands() {
        return this.commands;
    }

    /** Command the dog knows setter. */
    public Cat SetCommand(AnimalCommands command) {
        this.commands.add(command);
        return this;
    }

    /** Climbing degree getter. */
    public CatClimbingDegrees GetClimbingDegree() {
        return this.climbingDegree;
    }

    /** Climbing degree setter. */
    public Cat SetClimbingDegree(CatClimbingDegrees climbingDegree) {
        this.climbingDegree = climbingDegree;
        return this;
    }

    /** Compares animals by birth day. */
    @Override
    public int compareTo(Animal animal) {
        return this.birthDate.compareTo(animal.GetBirthDate());
    }
}