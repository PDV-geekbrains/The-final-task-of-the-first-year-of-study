package OOP_Java.App.Core;

import java.util.Date;
import java.util.List;

public class Pet extends Animal {
    private String petKind;
    private String name;
    private Date birthDate;
    private List<String> commands;
    private String petOwnerAddress;

    /** Constructor */
    public Pet(
            String petKind,
            String name,
            String petOwnerAddress) {
        this.petKind = petKind;
        this.name = name;
        this.petOwnerAddress = petOwnerAddress;
    }

    /** Sets kind of pet. */
    public void SetPetKind(String petKind) {
        this.petKind = petKind;
    }

    /** Gets kind of pet. */
    public String GetPetKind() {
        return this.petKind;
    }

    /** Sets pet name. */
    public void SetName(String name) {
        this.name = name;
    }

    /** Gets the pet name. */
    public String GetName() {
        return this.name;
    }

    /** Sets the pet birth date. */
    public void SetBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /** Gets the pet birth date. */
    public Date GetBirthDate() {
        return this.birthDate;
    }

    /** Sets commands the pet knows. */
    public void SetCommands(List<String> commands) {
        this.commands = commands;
    }

    /** Gets commands the pet knows. */
    public List<String> GetCommands() {
        return this.commands;
    }

    /** Sets pet owner address. */
    public void SetPetOwnerAddress(String petOwnerAddress) {
        this.petOwnerAddress = petOwnerAddress;
    }

    /** Gets pet owner address. */
    public String GetPetOwnerAddress() {
        return this.petOwnerAddress;
    }
}
