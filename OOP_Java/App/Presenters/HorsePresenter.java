package OOP_Java.App.Presenters;

import java.util.LinkedList;

import OOP_Java.App.Core.Horse;
import OOP_Java.App.Core.DTOs.HorseFullInfoDto;
import OOP_Java.App.Core.Enums.AnimalCommands;
import OOP_Java.App.View.View;

public class HorsePresenter {
    /**
     * Adds info to animal type of {@link OOP_Java.App.Core.Horse}.
     * 
     * @param animal Animal type of {@link OOP_Java.App.Core.Horse}.
     * @param view   View.
     * @return {@link OOP_Java.App.Core.Horse} object.
     */
    public static Horse AddInfoToHorse(Horse horse, View view) {
        // Set weight.
        horse.SetWeight(view.GetUserDoubleValueInput(
                "\nEnter horse weight in kg: "));

        // Set load capacity.
        horse.SetLoadCapacity(view.GetUserIntValueInput(
                "\nEnter horse load capacity in kg: "));

        // Set horse maximum speed.
        horse.SetMaxSpeed(view.GetUserIntValueInput("\nEnter horse maximum speed in km/h: "));

        return horse;
    }

    /**
     * Displays full info about animal type of {@link OOP_Java.App.Core.Horse}.
     * 
     * @param horse Horse instance.
     * @param view  View instance.
     */
    public static void DisplayHorseInfo(Horse horse, View view) {
        view.DisplayMessage(GetFormattedHorseInfo(horse.GetFullInfo()));
    }

    /** Generates a report to display to a user. */
    private static String GetFormattedHorseInfo(HorseFullInfoDto dto) {
        StringBuilder text = new StringBuilder()
                .append(("\n=== ANIMAL INFO ===\n\n"))
                .append("Animal type: " + dto.animalType().toString() + "\n")
                .append("Pet kind: " + dto.petKind() + "\n")
                .append("Weight, kg: " +
                        (dto.weight() > 0 ? dto.weight() : "") + "\n")
                .append("Horse load capacity, kg: " + dto.loadCapacity() + "\n")
                .append("Name: " + dto.name() + "\n")
                .append("Birth date: " + dto.birthDate() + "\n")
                .append("Commands: " + SetCommandsInLine(dto.commands()) + "\n")
                .append("Maximum speed: " + dto.maxSpeed());

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
