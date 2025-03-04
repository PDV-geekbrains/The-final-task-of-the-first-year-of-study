package OOP_Java.App.Presenters;

import OOP_Java.App.Core.Enums.AnimalCommands;
import OOP_Java.App.Core.Interfaces.IDomesticatedAnimal;
import OOP_Java.App.View.View;

public class DomesticatedAnimalPresenter {
    /**
     * Gets from user properties of domesticated animal.
     * 
     * @param pet  Concrete pet.
     * @param view View layer.
     * @return The pet.
     */
    public static IDomesticatedAnimal AddInfoToDomesticatedAnimal(
            IDomesticatedAnimal pet,
            View view) {
        // Set animal name.
        pet.SetName(view.GetUserStringValueInput("\nEnter animal name: "));

        // Set animal birth day.
        pet.SetBirthDate(view.GetUserDataInput("\nEnter animal birth day in format YYYY-MM-DD: "));

        // Set commands animal knows.
        do {
            StringBuilder sb = new StringBuilder()
                    .append("\n=== ANIMAL COMMANDS LIST ===\n\n")
                    .append("Commands the animal already knows: ");

            // Display commands the animal already knows.
            if (pet.GetCommands().size() == 0) {
                sb.append("---");
            } else {
                for (AnimalCommands command : pet.GetCommands()) {
                    sb.append(command.toString() + " ");
                }
            }
            sb.append("\n\n");

            // Display animal commands list user can pick from.
            int i = 0;
            for (AnimalCommands command : AnimalCommands.values()) {
                sb.append(++i + ". " + command + "\n");
            }
            sb.append("Enter menu item number: ");

            view.CleanScreen();
            int menuItemNumber = view.GetMenuItemUserChoice(sb.toString(), i);

            pet.SetCommand(AnimalCommands.values()[menuItemNumber - 1]);
        } while (AddCommandOrContinue(pet, view));

        return pet;
    }

    /**
     * Suggests user to add new command pet knows or continue to add other
     * pet properties.
     * 
     * @return True: add new command, False: continue.
     */
    private static boolean AddCommandOrContinue(IDomesticatedAnimal pet, View view) {
        StringBuilder sb = new StringBuilder()
                .append("\n\nCommands the animal already knows: ");

        // Display commands the animal already knows.
        if (pet.GetCommands().size() == 0) {
            sb.append("---");
        } else {
            for (AnimalCommands command : pet.GetCommands()) {
                sb.append(command.toString() + " ");
            }
        }
        sb.append("\n")
                .append("\n1. Add new command\n")
                .append("2. Continue\n")
                .append("Enter menu item number: ");

        boolean result = false;
        if (view.GetMenuItemUserChoice(sb.toString(), 2) == 1) {
            result = true;
        }
        return result;
    }
}
