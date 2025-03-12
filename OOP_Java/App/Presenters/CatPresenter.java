package OOP_Java.App.Presenters;

import OOP_Java.App.Models.Cat;
import OOP_Java.App.Models.DTOs.CatFullInfoDto;
import OOP_Java.App.Models.Enums.CatClimbingDegrees;
import OOP_Java.App.Utilities.Util;
import OOP_Java.App.View.View;

public class CatPresenter {
    /**
     * Adds info to animal type of {@link OOP_Java.App.Models.Cat}.
     * 
     * @param animal Animal type of {@link OOP_Java.App.Models.Cat}.
     * @param view   View.
     * @return {@link OOP_Java.App.Models.Cat} object.
     */
    public static Cat AddInfoToCat(Cat cat, View view) {
        // Set weight.
        cat.SetWeight(view.GetUserDoubleValueInput(
                "\nEnter cat weight in kg: "));

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
     * Displays full info about animal type of {@link OOP_Java.App.Models.Cat}.
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
                .append("Commands: " + Util.SetCommandsInLine(dto.commands()) + "\n")
                .append("Climbing degree: " +
                        (dto.climbingDegree() != null ? dto.climbingDegree() : ""));

        return text.toString();
    }
}
