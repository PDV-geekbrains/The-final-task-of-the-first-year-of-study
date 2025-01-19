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
    public PackAnimal(String name) {
        super.SetAnimalType("Pack animal");
        this.name = name;
    }

    /** Get kind of the pack animal. */
    public String GetPackAnimalKind() {
        return this.packAnimalKind;
    }

    /** Set kind of the pack animal. */
    protected void SetPackAnimalKind(String packAnimalKind) {
        this.packAnimalKind = packAnimalKind;
    }

    /** Get the pack animal name. */
    public String GetName() {
        return this.name;
    }

    /** Set the pack animal name. */
    public void setName(String name) {
        this.name = name;
    }

    /** Get the pack animal birth date. */
    public Date GetBirthDate() {
        return this.birthDate;
    }

    /** Set the pack animal birth date. */
    public void SetBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /** Get commands the pack animal knows. */
    public List<String> GetCommands() {
        return this.commands;
    }

    /** Set commands the pack animal knows. */
    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    /** Get the pack animal load capacity in kilograms. */
    public int GetLoadCapacity() {
        return this.loadCapacity;
    }

    /** Set the pack animal load capacity in kilograms. */
    public void SetLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
