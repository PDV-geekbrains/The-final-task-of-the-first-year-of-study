package OOP_Java.App.Models;

import java.util.LinkedList;

import OOP_Java.App.Models.DTOs.AnimalShortInfoDto;
import OOP_Java.App.Models.DTOs.CamelFullInfoDto;
import OOP_Java.App.Models.Enums.AnimalCommands;
import OOP_Java.App.Models.Enums.AnimalKinds;
import OOP_Java.App.Models.Interfaces.IDomesticatedAnimal;

/**
 * Class describes a camel.
 */
public class Camel extends PackAnimal implements IDomesticatedAnimal {
    private static final AnimalKinds petKind = AnimalKinds.CAMEL;
    private float weight;
    private int loadCapacity;
    private String name;
    private String birthDate;
    private LinkedList<AnimalCommands> commands = new LinkedList<>();
    private int withoutWaterPeriod; // in days.

    /** Constructor. */
    public Camel() {
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
    public Camel SetWeight(float weight) {
        this.weight = weight;
        return this;
    }

    /** Full info getter. */
    @Override
    public CamelFullInfoDto GetFullInfo() {
        return new CamelFullInfoDto(
                super.GetAnimalType(),
                petKind,
                this.weight,
                this.loadCapacity,
                this.name,
                this.birthDate,
                this.commands,
                this.withoutWaterPeriod);
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
    public Camel SetLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
        return this;
    }

    /** Name getter. */
    public String GetName() {
        return this.name;
    }

    /** Name setter. */
    public Camel SetName(String name) {
        this.name = name;
        return this;
    }

    /** Birth date getter. */
    @Override
    public String GetBirthDate() {
        return this.birthDate;
    }

    /** Birth date setter. */
    public Camel SetBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /** Commands getter. */
    public LinkedList<AnimalCommands> GetCommands() {
        return this.commands;
    }

    /** Command setter. */
    public Camel SetCommand(AnimalCommands command) {
        this.commands.add(command);
        return this;
    }

    /** Without water period getter. */
    public int GetWithoutWaterPeriod() {
        return this.withoutWaterPeriod;
    }

    /**
     * Without water period setter.
     */
    public Camel SetWithoutWaterPeriod(int period) {
        this.withoutWaterPeriod = period;
        return this;
    }

    /** Compares animals by birth day. */
    @Override
    public int compareTo(Animal animal) {
        return this.birthDate.compareTo(animal.GetBirthDate());
    }
}