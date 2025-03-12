package OOP_Java.App.Presenters;

import OOP_Java.App.Models.Donkey;
import OOP_Java.App.Models.DTOs.DonkeyFullInfoDto;
import OOP_Java.App.Models.Enums.DonkeyInsistenceDegrees;
import OOP_Java.App.Utilities.Util;
import OOP_Java.App.View.View;

public class DonkeyPresenter {
    /**
     * Adds info to animal type of {@link OOP_Java.App.Models.Donkey}.
     * 
     * @param animal Animal type of {@link OOP_Java.App.Models.Donkey}.
     * @param view   View.
     * @return {@link OOP_Java.App.Models.Donkey} object.
     */
    public static Donkey AddInfoToDonkey(Donkey donkey, View view) {
        // Set weight.
        donkey.SetWeight(view.GetUserDoubleValueInput(
                "\nEnter donkey weight in kg: "));

        // Set load capacity.
        donkey.SetLoadCapacity(view.GetUserIntValueInput(
                "\nEnter donkey load capacity in kg: "));

        // Set donkey insistence degree.
        int i = 0;
        StringBuilder sb = new StringBuilder()
                .append("\n=== DONKEY INSISTENCE DEGREES LIST ===\n\n");

        // Display menu user can pick from.
        for (DonkeyInsistenceDegrees degree : DonkeyInsistenceDegrees.values()) {
            sb.append(++i + ". " + degree + "\n");
        }
        sb.append("Enter menu item number: ");

        view.CleanScreen();
        int menuItemNumber = view.GetMenuItemUserChoice(sb.toString(), i);

        donkey.SetInsistenceDegree(DonkeyInsistenceDegrees.values()[menuItemNumber - 1]);

        return donkey;
    }

    /**
     * Displays full info about animal type of {@link OOP_Java.App.Models.Donkey}.
     * 
     * @param donkey Donkey instance.
     * @param view   View instance.
     */
    public static void DisplayDonkeyInfo(Donkey donkey, View view) {
        view.DisplayMessage(GetFormattedDonkeyInfo(donkey.GetFullInfo()));
    }

    /** Generates a report to display to a user. */
    private static String GetFormattedDonkeyInfo(DonkeyFullInfoDto dto) {
        StringBuilder text = new StringBuilder()
                .append(("\n=== ANIMAL INFO ===\n\n"))
                .append("Animal type: " + dto.animalType().toString() + "\n")
                .append("Pack animal kind: " + dto.packAnimalKind() + "\n")
                .append("Weight, kg: " +
                        (dto.weight() > 0 ? dto.weight() : "") + "\n")
                .append("Donkey load capacity, kg: " + dto.loadCapacity() + "\n")
                .append("Name: " + dto.name() + "\n")
                .append("Birth date: " + dto.birthDate() + "\n")
                .append("Commands: " + Util.SetCommandsInLine(dto.commands()) + "\n")
                .append("Insistence degree: " + dto.insistenceDegree());

        return text.toString();
    }
}
