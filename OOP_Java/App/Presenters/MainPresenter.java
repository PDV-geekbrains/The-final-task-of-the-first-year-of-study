package OOP_Java.App.Presenters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import OOP_Java.App.Core.Animal;
import OOP_Java.App.Core.Enums.AnimalKinds;
import OOP_Java.App.Core.Enums.AnimalTypes;
import OOP_Java.App.View.View;

/** Class represents communication between app core and app view. */
public class MainPresenter {
    private static MainPresenter instance = null;
    private View view;
    private ArrayList<Animal> animals;

    /** Constructor. */
    private MainPresenter(View view, ArrayList<Animal> animals) {
        this.view = view;
        this.animals = animals;
    }

    public static MainPresenter GetInstance(View view, ArrayList<Animal> animals) {
        if (instance == null) {
            instance = new MainPresenter(view, animals);
        }

        return instance;
    }

    /** Displays main menu. */
    public void DisplayMainMenu() {
        StringBuilder sb = new StringBuilder()
                .append("\n=== MAIN MENU ===\n\n")
                .append("1. Display list of animals\n")
                .append("2. Display list of animals by birthday\n")
                .append("3. Display total animal quantity\n")
                .append("4. Display animal info\n")
                .append("5. Add animal\n")
                .append("6. Delete animal\n")
                .append("7. Exit\n\n")
                .append("Enter menu item number: ");

        view.CleanScreen();
        switch (view.GetMenuItemUserChoice(sb.toString(), 7)) {
            // Display list of animals.
            case 1:
                DisplayListOfAnimals();
                break;
            // Display list of animal by birthday.
            case 2:
                DisplayAnimalsByBirthday();
                break;
            // Display total animal quantity.
            case 3:
                DisplayTotalAnimalQuantity();
                break;
            // Display animal info.
            case 4:
                view.CleanScreen();
                AnimalInfoPresenter.DisplayAnimalInfo(
                        GetAnimalIdFromUser(),
                        view,
                        animals);
                break;
            // Add animal.
            case 5:
                AnimalCreator.Create(
                        GetAnimalKindFromUser(),
                        view,
                        animals);
                break;
            // Delete animal.
            case 6:
                DeleteAnimal();
                break;
            // Exit app.
            case 7:
                view.CleanScreen();
                System.exit(0);
            default:
                break;
        }

        AskExitOrContinue();
    }

    /**
     * Returns animal kind by ID entered by a user.
     * 
     * @return Animal kind.
     */
    private AnimalKinds GetAnimalKindFromUser() {
        StringBuilder sb = new StringBuilder()
                .append("\n=== ADD ANIMAL TO ANIMALS LIST ===\n\n");

        int i = 0;
        for (AnimalKinds item : AnimalKinds.values()) {
            sb.append(++i + ". " + item + "\n");
        }
        sb.append("Enter menu item number: ");

        view.CleanScreen();
        int menuItemNumber = view.GetMenuItemUserChoice(sb.toString(), i);

        return AnimalKinds.values()[menuItemNumber - 1];
    }

    /** Displays list of animals in short form. */
    private void DisplayListOfAnimals() {
        view.CleanScreen();
        // Table caption.
        view.DisplayMessage(new StringBuilder()
                .append("\n=== LIST OF ANIMALS ===\n\n")
                .append(String.format("%-7s", "ID"))
                .append(String.format("%-15s", "Type"))
                .append(String.format("%-15s", "Kind"))
                .append(String.format("%-15s", "Name"))
                .append(String.format("%-15s", "Birth Day"))
                .append("\n" + String.valueOf("-").repeat(62))
                .toString());

        // List of all animals.
        for (Animal animal : animals) {
            view.DisplayMessage(new StringBuilder()
                    .append(String.format("%-7d", animals.indexOf(animal)))
                    .append(String.format("%-15s", animal.GetShortInfo().animalType()))
                    .append(String.format("%-15s", animal.GetShortInfo().animalKind()))
                    .append(String.format("%-15s", animal.GetShortInfo().name()))
                    .append(String.format("%-15s", animal.GetShortInfo().birthDate()))
                    .toString());
        }
    }

    /** Displays list of animals sorted by birth day. */
    private void DisplayAnimalsByBirthday() {
        List<Animal> sortedAnimalsList = this.animals
                .stream()
                .sorted()
                .collect(Collectors.toList());

        view.CleanScreen();
        // Table caption.
        view.DisplayMessage(new StringBuilder()
                .append("\n=== LIST OF ANIMALS BY BIRTH DAY ===\n\n")
                .append(String.format("%-15s", "Birth Day"))
                .append(String.format("%-15s", "Type"))
                .append(String.format("%-15s", "Kind"))
                .append(String.format("%-15s", "Name"))
                .append("\n" + String.valueOf("-").repeat(60))
                .toString());

        // List of animals.
        for (Animal animal : sortedAnimalsList) {
            view.DisplayMessage(new StringBuilder()
                    .append(String.format("%-15s", animal.GetShortInfo().birthDate()))
                    .append(String.format("%-15s", animal.GetShortInfo().animalType()))
                    .append(String.format("%-15s", animal.GetShortInfo().animalKind()))
                    .append(String.format("%-15s", animal.GetShortInfo().name()))
                    .toString());
        }
    }

    /** Display number of items in animals list. */
    private void DisplayTotalAnimalQuantity() {
        int petsNum = 0;
        for (Animal animal : animals) {
            if (animal.GetAnimalType() == AnimalTypes.PET) {
                petsNum++;
            }
        }

        view.CleanScreen();
        view.DisplayMessage(new StringBuilder()
                .append("\n=== TOTAL QUANTITY ===\n\n")
                .append("Pets : " + petsNum + "\n")
                .append("Pack animals :" + (animals.size() - petsNum) + "\n")
                .append("Total: " + animals.size()).toString());
    }

    /** Deletes animal from animals list. */
    public void DeleteAnimal() {
        int id = GetAnimalIdFromUser();

        view.CleanScreen();
        if (GetConfirmationToDelete(id)) {
            animals.remove(id);
        }
    }

    /**
     * Gets animal ID from a user.
     * 
     * @return Animal ID.
     */
    private int GetAnimalIdFromUser() {
        int id = -1;
        int maxId = animals.size() - 1;

        do {
            id = view.GetUserIntValueInput("\nEnter animal ID: ");

            if (!IsAnimalIdValid(id)) {
                view.DisplayMessage("Error. You have entered " + id + ". " +
                        "Correct animal ID: 0 <= ID <= " + maxId + ".");
            }
        } while (!IsAnimalIdValid(id));

        return id;
    }

    /**
     * Checks animal ID validity.
     * 
     * @param id Animal ID.
     * @return True if ID is more or equal 0 and less or equal maximum ID, otherwise
     *         False.
     */
    private boolean IsAnimalIdValid(int id) {
        int maxId = this.animals.size() - 1;

        if (id >= 0 && id <= maxId) {
            return true;
        }
        return false;
    }

    /** Suggests to a user to exit the app or to go to the Main menu. */
    private void AskExitOrContinue() {
        // Display the submenu.
        StringBuilder sb = new StringBuilder()
                .append("\n1. Return to Main Menu\n")
                .append("2. Exit\n")
                .append("Enter menu item number: ");

        switch (view.GetMenuItemUserChoice(sb.toString(), 2)) {
            case 1:
                DisplayMainMenu();
                break;
            case 2:
                System.exit(0);
        }
    }

    /**
     * Gets confirmation from user to delete animal from animals list.
     * 
     * @param animalId Animal ID
     * @return True: delete animal. False: do not delete.
     */
    private boolean GetConfirmationToDelete(int animalId) {
        boolean result = false;

        StringBuilder sb = new StringBuilder()
                .append("\n=== DELETE ANIMAL ===\n\n")
                .append("You are about to delete the animal with ID = " + animalId +
                        " from the animals list.\n Please confirm your choice.\n")
                .append("1. Delete\n")
                .append("2. Exit\n")
                .append("Enter menu item number: ");

        if (view.GetMenuItemUserChoice(sb.toString(), 2) == 1) {
            result = true;
        }

        return result;
    }
}