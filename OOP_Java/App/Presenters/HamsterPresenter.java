package OOP_Java.App.Presenters;

import OOP_Java.App.Models.Hamster;
import OOP_Java.App.Models.DTOs.HamsterFullInfoDto;
import OOP_Java.App.Utilities.Util;
import OOP_Java.App.View.View;

public class HamsterPresenter {
        /**
         * Adds info to animal type of {@link OOP_Java.App.Models.Hamster}.
         * 
         * @param animal Animal type of {@link OOP_Java.App.Models.Hamster}.
         * @param view   View.
         * @return {@link OOP_Java.App.Models.Hamster} object.
         */
        public static Hamster AddInfoToHamster(Hamster hamster, View view) {
                // Set weight.
                hamster.SetWeight(view.GetUserDoubleValueInput(
                                "\nEnter hamster weight in kg: "));

                // Set owner home address.
                hamster.SetOwnerHomeAddress(view.GetUserStringValueInput(
                                "\nEnter hamster owner home address: "));

                // Set hamster stored feed amount.
                hamster.SetStoredFeedAmount(view.GetUserDoubleValueInput(
                                "\nEnter hamster stored feed amount in grammes: "));

                return hamster;
        }

        /**
         * Displays full info about animal type of {@link OOP_Java.App.Models.Hamster}.
         * 
         * @param hamster Hamster.
         * @param view    View.
         */
        public static void DisplayHamsterInfo(Hamster hamster, View view) {
                view.DisplayMessage(GetFormattedHamsterInfo(hamster.GetFullInfo()));
        }

        /** Generates a report to display to a user. */
        private static String GetFormattedHamsterInfo(HamsterFullInfoDto dto) {
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
                                .append("Stored feed amount, g: " + (dto.storedFeedAmount()));

                return text.toString();
        }
}
