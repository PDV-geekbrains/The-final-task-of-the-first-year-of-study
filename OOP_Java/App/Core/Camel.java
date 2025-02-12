package OOP_Java.App.Core;

import java.util.List;

import OOP_Java.App.Core.Enums.AnimalTypes;
import OOP_Java.App.Core.Enums.AnimalKinds;

public class Camel extends PackAnimal {
    private int withoutWaterPeriod;
    private String name;
    private List<String> commands;

    /**
     * Constructor.
     * 
     * @param name               Camel name.
     * @param withoutWaterPeriod Period in days the camel can do without water.
     */
    public Camel(
            String name,
            int withoutWaterPeriod) {
        super(AnimalKinds.CAMEL);
        this.withoutWaterPeriod = withoutWaterPeriod;
        this.name = name;
    }

    /** Get period in days the camel can do without water */
    public int GetWithoutWaterPeriod() {
        return this.withoutWaterPeriod;
    }

    /** Set period in days the camel can do without water */
    public void SetWithoutWaterPeriod(int withoutWaterPeriod) {
        this.withoutWaterPeriod = withoutWaterPeriod;
    }

    /** Gets camel name. */
    public String GetName() {
        return name;
    }

    /** Sets camel name. */
    public void SetName(String name) {
        this.name = name;
    }

    /** Get commands the pack animal knows. */
    public List<String> GetCommands() {
        return this.commands;
    }

    /** Set commands the pack animal knows. */
    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    /** Get full info about the camel. */
    public String GetFullInfo() {
        StringBuilder commands = new StringBuilder();

        if (super.GetCommands().size() > 0) {
            for (String command : super.GetCommands()) {
                commands.append(command + " ");
            }
        }

        StringBuilder message = new StringBuilder()
                .append("Animal type = " + AnimalTypes.PACK_ANIMAL + "\n")
                .append("Weight = " + super.GetWeight() + " kg" + "\n")
                .append("Name = " + name + "\n")
                .append("Pack animal kind = " + AnimalKinds.CAMEL + "\n")
                .append("Birth date = " + super.GetBirthDate() + "\n")
                .append("Commands = " + commands.toString() + "\n")
                .append("Load capacity = " + super.GetLoadCapacity() + " kg" + "\n")
                .append("Without water period = " + withoutWaterPeriod + " day/days" + "\n");

        return message.toString();
    }
}