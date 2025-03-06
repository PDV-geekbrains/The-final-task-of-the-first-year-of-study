package OOP_Java.App.Presenters;

import java.util.LinkedList;

import OOP_Java.App.Core.Cat;
import OOP_Java.App.Core.DTOs.CatFullInfoDto;
import OOP_Java.App.Core.Enums.AnimalCommands;
import OOP_Java.App.Core.Enums.CatClimbingDegrees;
import OOP_Java.App.View.View;

public class CatPresenter {
    /**
     * Adds info to animal type of {@link OOP_Java.App.Core.Cat}.
     * 
     * @param animal Animal type of {@link OOP_Java.App.Core.Cat}.
     * @param view   View.
     * @return {@link OOP_Java.App.Core.Cat} object.
     */
    public static Cat AddInfoToCat(Cat cat, View view) {
        // Set weight.
        cat.SetWeight(view.GetUserDoubleValueInput(
                "\nEnter cat weight: "));

        // Set owner home address.
        cat.SetOwnerHomeAddress(view.GetUserStringValueInput(
                "\nEnter cat owner home address: "));

        // Set cat climbing degree.
        int i = 0;
        StringBuilder sb = new StringBuilder()
                .append("\n=== CAT CLIMBING DEGREES LIST ===\n\n");

        // Display menu user can pick from.
        for (CatClimbingDegrees degree : CatClimbingDegrees.values()) {
            sb.append(++i + ". " + degree + "\n");
        }
        sb.append("Enter menu item number: ");

        view.CleanScreen();
        int menuItemNumber = view.GetMenuItemUserChoice(sb.toString(), i);

        cat.SetClimbingDegree(CatClimbingDegrees.values()[menuItemNumber - 1]);

        return cat;
    }

    /**
     * Displays full info about animal type of {@link OOP_Java.App.Core.Cat}.
     * 
     * @param cat  Cat instance.
     * @param view View instance.
     */
    public static void DisplayCatInfo(Cat cat, View view) {
        view.DisplayMessage(GetFormattedCatInfo(cat.GetFullInfo()));
    }

    /** Generates a report to display to a user. */
    private static String GetFormattedCatInfo(CatFullInfoDto dto) {
        StringBuilder text = new StringBuilder()
                .append(("\n=== ANIMAL INFO ===\n\n"))
                .append("Animal type: " + dto.animalType().toString() + "\n")
                .append("Pet kind: " + dto.petKind() + "\n")
                .append("Weight, kg: " +
                        (dto.weight() > 0 ? dto.weight() : "") + "\n")
                .append("Owner home address: " + dto.ownerHomeAddress() + "\n")
                .append("Name: " + dto.name() + "\n")
                .append("Birth date: " + dto.birthDate() + "\n")
                .append("Commands: " + SetCommandsInLine(dto.commands()) + "\n")
                .append("Climbing degree: " +
                        (dto.climbingDegree() != null ? dto.climbingDegree() : ""));

        return text.toString();
    }

    /** Returns commands separated by spaces. */
    private static String SetCommandsInLine(LinkedList<AnimalCommands> commands) {
        StringBuilder sb = new StringBuilder();

        for (AnimalCommands command : commands) {
            if (!commands.isEmpty()) {
                if (sb.toString() == "") {
                    sb.append(command.toString());
                } else {
                    sb.append(", " + command.toString());
                }
            }
        }

        return sb.toString();
    }

}
