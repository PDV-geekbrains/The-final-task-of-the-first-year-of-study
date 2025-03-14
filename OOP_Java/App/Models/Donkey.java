package OOP_Java.App.Models;

import java.util.LinkedList;

import OOP_Java.App.Models.DTOs.AnimalShortInfoDto;
import OOP_Java.App.Models.DTOs.DonkeyFullInfoDto;
import OOP_Java.App.Models.Enums.AnimalCommands;
import OOP_Java.App.Models.Enums.AnimalKinds;
import OOP_Java.App.Models.Enums.DonkeyInsistenceDegrees;
import OOP_Java.App.Models.Interfaces.IDomesticatedAnimal;

/**
 * Class describes a donkey.
 */
public class Donkey extends PackAnimal implements IDomesticatedAnimal {
    private static final AnimalKinds petKind = AnimalKinds.DONKEY;
    private float weight;
    private int loadCapacity;
    private String name;
    private String birthDate;
    private LinkedList<AnimalCommands> commands = new LinkedList<>();
    private DonkeyInsistenceDegrees insistenceDegree;

    /** Constructor. */
    public Donkey() {
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
    public Donkey SetWeight(float weight) {
        this.weight = weight;
        return this;
    }

    /** Full info getter. */
    @Override
    public DonkeyFullInfoDto GetFullInfo() {
        return new DonkeyFullInfoDto(
                super.GetAnimalType(),
                petKind,
                this.weight,
                this.loadCapacity,
                this.name,
                this.birthDate,
                this.commands,
                this.insistenceDegree);
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

    /** Load capacity getter. */
    @Override
    public int GetLoadCapacity() {
        return this.loadCapacity;
    }

    /** Load capacity setter. */
    @Override
    public Donkey SetLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
        return this;
    }

    /** Name getter. */
    public String GetName() {
        return this.name;
    }

    /** Name setter. */
    public Donkey SetName(String name) {
        this.name = name;
        return this;
    }

    /** Birth date getter. */
    @Override
    public String GetBirthDate() {
        return this.birthDate;
    }

    /** Birth date setter. */
    public Donkey SetBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /** Commands getter. */
    public LinkedList<AnimalCommands> GetCommands() {
        return this.commands;
    }

    /** Command setter. */
    public Donkey SetCommand(AnimalCommands command) {
        this.commands.add(command);
        return this;
    }

    /** Insistence degree getter. */
    public DonkeyInsistenceDegrees GetInsistenceDegree() {
        return this.insistenceDegree;
    }

    /**
     * Insistence degree setter.
     */
    public Donkey SetInsistenceDegree(DonkeyInsistenceDegrees insistenceDegree) {
        this.insistenceDegree = insistenceDegree;
        return this;
    }

    /** Compares animals by birth day. */
    @Override
    public int compareTo(Animal animal) {
        return this.birthDate.compareTo(animal.GetBirthDate());
    }
}
