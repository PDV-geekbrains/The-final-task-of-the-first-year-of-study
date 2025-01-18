package OOP_Java.App.Core;

import java.util.Date;
import java.util.List;

public class PackAnimal extends Animal {
    private String packAnimalKind;
    private String name;
    private Date birthDate;
    private List<String> commands;
    private int loadCapacity;

    /** Constructor */
    public PackAnimal(String packAnimalKind, String name) {
        this.packAnimalKind = packAnimalKind;
        this.name = name;
    }

    /** Get kind of the pet animal. */
    public String GetpackAnimalKind() {
        return this.packAnimalKind;
    }

    /** Set kind of the pet animal. */
    public void SetpackAnimalKind(String packAnimalKind) {
        this.packAnimalKind = packAnimalKind;
    }

    /** Get pet animal name. */
    public String GetName() {
        return this.name;
    }

    /** Set pet animal name. */
    public void setName(String name) {
        this.name = name;
    }

    /** Get pet animal birth date. */
    public Date GetBirthDate() {
        return this.birthDate;
    }

    /** Set pet animal birth date. */
    public void SetBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /** Get commands the pet animal knows. */
    public List<String> GetCommands() {
        return this.commands;
    }

    /** Set commands the pet animal knows. */
    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    /** Get pet animal load capacity in kilograms. */
    public int GetLoadCapacity() {
        return this.loadCapacity;
    }

    /** Set pet animal load capacity in kilograms. */
    public void SetLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
