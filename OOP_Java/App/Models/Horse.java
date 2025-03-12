package OOP_Java.App.Models;

import java.util.LinkedList;

import OOP_Java.App.Models.DTOs.AnimalShortInfoDto;
import OOP_Java.App.Models.DTOs.HorseFullInfoDto;
import OOP_Java.App.Models.Enums.AnimalCommands;
import OOP_Java.App.Models.Enums.AnimalKinds;
import OOP_Java.App.Models.Enums.AnimalTypes;
import OOP_Java.App.Models.Interfaces.IDomesticatedAnimal;

/**
 * Class describes a horse.
 */
public class Horse extends PackAnimal implements IDomesticatedAnimal {
    private static final AnimalKinds petKind = AnimalKinds.HORSE;
    private float weight;
    private int loadCapacity;
    private String name;
    private String birthDate;
    private LinkedList<AnimalCommands> commands = new LinkedList<>();
    private int maxSpeed; // in kilometers per hour.

    /** Constructor. */
    public Horse() {
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
    public Horse SetWeight(float weight) {
        this.weight = weight;
        return this;
    }

    /** Full info getter. */
    @Override
    public HorseFullInfoDto GetFullInfo() {
        return new HorseFullInfoDto(
                super.GetAnimalType(),
                petKind,
                this.weight,
                this.loadCapacity,
                this.name,
                this.birthDate,
                this.commands,
                this.maxSpeed);
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
    public Horse SetLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
        return this;
    }

    /** Name getter. */
    public String GetName() {
        return this.name;
    }

    /** Name setter. */
    public Horse SetName(String name) {
        this.name = name;
        return this;
    }

    /** Birth date getter. */
    @Override
    public String GetBirthDate() {
        return this.birthDate;
    }

    /** Birth date setter. */
    public Horse SetBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /** Commands a horse knows getter. */
    public LinkedList<AnimalCommands> GetCommands() {
        return this.commands;
    }

    /** Command a horse knows setter. */
    public Horse SetCommand(AnimalCommands command) {
        this.commands.add(command);
        return this;
    }

    /** Horse max. speed getter. */
    public int GetMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Horse max. speed setter.
     * 
     * @param maxSpeed Max. speed in km/h.
     * @return Horse instance.
     */
    public Horse SetMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    /** Compares animals by birth day. */
    @Override
    public int compareTo(Animal animal) {
        return this.birthDate.compareTo(animal.GetBirthDate());
    }
}
