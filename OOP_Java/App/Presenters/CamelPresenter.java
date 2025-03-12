package OOP_Java.App.Presenters;

import OOP_Java.App.Models.Camel;
import OOP_Java.App.Models.DTOs.CamelFullInfoDto;
import OOP_Java.App.Utilities.Util;
import OOP_Java.App.View.View;

public class CamelPresenter {
        /**
         * Adds info to animal type of {@link OOP_Java.App.Models.Camel}.
         * 
         * @param animal Animal type of {@link OOP_Java.App.Models.Camel}.
         * @param view   View.
         * @return {@link OOP_Java.App.Models.Camel} object.
         */
        public static Camel AddInfoToCamel(Camel camel, View view) {
                // Set weight.
                camel.SetWeight(view.GetUserDoubleValueInput(
                                "\nEnter camel weight in kg: "));

                // Set load capacity.
                camel.SetLoadCapacity(view.GetUserIntValueInput(
                                "\nEnter camel load capacity in kg: "));

                // Set camel without water period.
                camel.SetWithoutWaterPeriod(view.GetUserIntValueInput(
                                "\nEnter camel without water period in days: "));

                return camel;
        }

        /**
         * Displays full info about animal type of {@link OOP_Java.App.Models.Camel}.
         * 
         * @param camel Camel instance.
         * @param view  View instance.
         */
        public static void DisplayCamelInfo(Camel camel, View view) {
                view.DisplayMessage(GetFormattedCamelInfo(camel.GetFullInfo()));
        }

        /** Generates a report to display to a user. */
        private static String GetFormattedCamelInfo(CamelFullInfoDto dto) {
                StringBuilder text = new StringBuilder()
                                .append(("\n=== ANIMAL INFO ===\n\n"))
                                .append("Animal type: " + dto.animalType().toString() + "\n")
                                .append("Pet kind: " + dto.packAnimalKind() + "\n")
                                .append("Weight, kg: " +
                                                (dto.weight() > 0 ? dto.weight() : "") + "\n")
                                .append("Camel load capacity, kg: " + dto.loadCapacity() + "\n")
                                .append("Name: " + dto.name() + "\n")
                                .append("Birth date: " + dto.birthDate() + "\n")
                                .append("Commands: " + Util.SetCommandsInLine(dto.commands()) + "\n")
                                .append("Without water period: " + dto.withoutWaterPeriod());

                return text.toString();
        }
}
