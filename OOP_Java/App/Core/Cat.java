package OOP_Java.App.Core;

import java.util.LinkedList;

import OOP_Java.App.Core.DTOs.CatFullInfoDto;
import OOP_Java.App.Core.Enums.AnimalTypes;
import OOP_Java.App.Core.Enums.CatClimbingDegrees;
import OOP_Java.App.Core.Enums.PetKinds;
import OOP_Java.App.Core.Interfaces.IDomesticatedAnimal;

public class Cat extends Pet implements IDomesticatedAnimal {
    private static final PetKinds petKind = PetKinds.CAT;
    private int weight;
    private String ownerHomeAddress;
    private String name;
    private String birthDate;
    private LinkedList<String> commands = new LinkedList<>();
    private CatClimbingDegrees climbingDegree;

    /** Constructor. */
    public Cat(
            String name,
            String ownerHomeAddress,
            CatClimbingDegrees climbingDegree) {
        this.name = name;
        this.ownerHomeAddress = ownerHomeAddress;
        this.climbingDegree = climbingDegree;
    }

    /** Animal type cat belongs to getter. */
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

    /** Full cat info getter. */
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

    /** Cat name getter. */
    public String GetName() {
        return this.name;
    }

    /** Cat name setter. */
    public void SetName(String name) {
        this.name = name;
    }

    /** Cat birth date getter. */
    public String GetBirthDate() {
        return this.birthDate;
    }

    /** Cat birth date setter. */
    public void SetBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /** Commands the cat knows getter. */
    public LinkedList<String> GetCommands() {
        return this.commands;
    }

    /** Command the cat knows setter. */
    public void SetCommand(String command) {
        this.commands.add(command);
    }

    /** Get the cat climbing degree. */
    public CatClimbingDegrees GetClimbingDegree() {
        return this.climbingDegree;
    }

    /** Set the cat climbing degree. */
    public void SetClimbingDegree(CatClimbingDegrees climbingDegree) {
        this.climbingDegree = climbingDegree;
    }
}
