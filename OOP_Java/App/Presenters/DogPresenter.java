package OOP_Java.App.Presenters;

import OOP_Java.App.Models.Dog;
import OOP_Java.App.Models.DTOs.DogFullInfoDto;
import OOP_Java.App.Models.Enums.DogTrackingDegrees;
import OOP_Java.App.Utilities.Util;
import OOP_Java.App.View.View;

public class DogPresenter {
    /**
     * Adds info to animal type of {@link OOP_Java.App.Models.Dog}.
     * 
     * @param animal Animal type of {@link OOP_Java.App.Models.Dog}.
     * @param view   View.
     * @return {@link OOP_Java.App.Models.Dog} object.
     */
    public static Dog AddInfoToDog(Dog dog, View view) {
        // Set weight.
        dog.SetWeight(view.GetUserDoubleValueInput(
                "\nEnter dog weight in kg: "));

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
     * Displays full info about animal type of {@link OOP_Java.App.Models.Dog}.
     * 
     * @param dog  Dog instance.
     * @param view View instance.
     */
    public static void DisplayDogInfo(Dog dog, View view) {
        view.DisplayMessage(GetFormattedDogInfo(dog.GetFullInfo()));
    }

    /** Generates a report to display to a user. */
    private static String GetFormattedDogInfo(DogFullInfoDto dto) {
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
                .append("Tracking degree: " +
                        (dto.trackingDegree() != null ? dto.trackingDegree() : ""));

        return text.toString();
    }
}
