package OOP_Java.App.Presenters;

import java.util.Iterator;
import java.util.LinkedList;

import OOP_Java.App.Core.Dog;
import OOP_Java.App.Core.DTOs.DogFullInfoDto;
import OOP_Java.App.Core.Enums.AnimalCommands;
import OOP_Java.App.Core.Enums.DogTrackingDegrees;
import OOP_Java.App.View.View;

public class DogPresenter {

    public static Dog AddInfoToDog(Dog dog, View view) {
        // Set weight.
        dog.SetWeight(view.GetUserDoubleValueInput(
                "\nEnter dog weight: "));

        // Set owner home address.
        dog.SetOwnerHomeAddress(view.GetUserStringValueInput(
                "\nEnter dog owner home address: "));

        // Set dog tracking degree.
        int i = 0;
        StringBuilder sb = new StringBuilder()
                .append("\n=== DOG TRACING DEGREES LIST ===\n\n");

        // Display menu user can pick from.
        for (DogTrackingDegrees degree : DogTrackingDegrees.values()) {
            sb.append(++i + ". " + degree + "\n");
        }
        sb.append("Enter menu item number: ");

        view.CleanScreen();
        int menuItemNumber = view.GetMenuItemUserChoice(sb.toString(), i);

        dog.SetTrackingDegree(DogTrackingDegrees.values()[menuItemNumber - 1]);

        return dog;
    }

    /**
     * Displays full info about a dog.
     * 
     * @param concreteDog Concrete dog.
     */
    public static void DisplayDogInfo(Dog concreteDog, View view) {
        view.DisplayMessage(GetFormattedDogInfo(concreteDog.GetFullInfo()));
    }

    /** Generates a report to display to a user. */
    private static String GetFormattedDogInfo(DogFullInfoDto dto) {
        StringBuilder text = new StringBuilder()
                .append(("\n=== ANIMAL INFO ===\n\n"))
                .append("Animal type: " + dto.animalType().toString() + "\n")
                .append("Pet kind: " + dto.petKind() + "\n")
                .append("Weight: " +
                        (dto.weight() > 0 ? dto.weight() : "") + "\n")
                .append("Owner home address: " + dto.ownerHomeAddress() + "\n")
                .append("Name: " + dto.name() + "\n")
                .append("Birth date: " + dto.birthDate() + "\n")
                .append("Commands: " + SetCommandsInLine(dto.commands()) + "\n")
                .append("Tracking degree: " +
                        (dto.trackingDegree() != null ? dto.trackingDegree() : ""));

        return text.toString();
    }

    /** Returns commands separated by spaces. */
    private static String SetCommandsInLine(LinkedList<AnimalCommands> commands) {
        StringBuilder sb = new StringBuilder();

        for (AnimalCommands command : commands) {
            if (!commands.isEmpty()) {
                sb.append(command.toString() + " ");
            }
        }

        return sb.toString();
    }
}
