package OOP_Java.App.Presenters;

import java.util.ArrayList;

import OOP_Java.App.Core.Animal;
import OOP_Java.App.Core.Cat;
import OOP_Java.App.Core.Dog;
import OOP_Java.App.View.View;

public class AnimalPresenter {
    private static AnimalPresenter instance = null;
    private View view;
    private ArrayList<Animal> animals;

    /** Constructor. */
    private AnimalPresenter(View view, ArrayList<Animal> animals) {
        this.view = view;
        this.animals = animals;
    }

    public static AnimalPresenter GetInstance(View view, ArrayList<Animal> animals) {
        if (instance == null) {
            instance = new AnimalPresenter(view, animals);
        }

        return instance;
    }

    /**
     * Display main menu.
     * 
     * @return Menu item number.
     */
    public void DisplayMainMenu() {
        StringBuilder sb = new StringBuilder()
                .append("=== MAIN MENU ===\n")
                .append("1. Display list of animals\n")
                .append("2. Display list of animal by birthday\n")
                .append("3. Display total animal quantity\n")
                .append("4. Add animal\n")
                .append("5. Get animal info\n")
                .append("6. Edit animal\n")
                .append("7. Delete animal\n")
                .append("8. Exit\n")
                .append("Enter menu item number...\n");

        switch (view.GetMenuItemUserChoice(sb.toString(), 8)) {
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
            // Add animal.
            case 4:
                DogPresenter.GetInstance(this, view, animals).DisplayAddAnimalDialog();
                break;
            // Get animal info.
            case 5:
                DisplayAnimalInfo();
                break;
            // Edit animal.
            case 6:
                DisplayEditAnimalDialog();
                break;
            // Delete animal.
            case 7:
                DisplayDeleteAnimalDialog();
                break;
            // Exit.
            case 8:
                System.exit(0);
            default:
                break;
        }
    }

    /** Displays list of animals in short form. */
    private void DisplayListOfAnimals() {
        view.DisplayMessage(new StringBuilder()
                .append(String.format("%-7s", "ID"))
                .append(String.format("%-15s", "Type"))
                .append(String.format("%-15s", "Kind"))
                .append(String.format("%-15s", "Name"))
                .append(String.format("%-15s", "Birth Day"))
                .toString());

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

    private void DisplayAnimalsByBirthday() {
        // TODO
    }

    /** Display number of items in animals list. */
    private void DisplayTotalAnimalQuantity() {
        StringBuilder message = new StringBuilder()
                .append("Total in the Animals list: ")
                .append(animals.size());
        view.DisplayMessage(message.toString());
    }

    // Displays full animal info.
    private void DisplayAnimalInfo() {
        int id = -1; // Wrong animal ID.

        while (IsAnimalIdValid(id) == false) {
            id = view.GetUserIntValueInput("Enter animal ID\n");

            if (!IsAnimalIdValid(id)) {
                view.DisplayMessage("Error. You have entered integer that is " +
                        "less 0 or greater max. animal ID. Please enter correct ID.");
            }
        }

        String fullName = animals.get(id).getClass().getName();
        String animalKind = fullName.substring(fullName.lastIndexOf(".") + 1);

        switch (animalKind) {
            case "Dog":
                Dog concreteDog = (Dog) animals.get(id);
                DogPresenter dp = DogPresenter.GetInstance(this, view, animals);
                dp.DisplayDogInfo(concreteDog);
                break;
            case "Cat":
                Cat concreteCat = (Cat) animals.get(id);

            default:
                break;
        }
    }

    public void DisplayEditAnimalDialog() {
        // TODO
    }

    public void DisplayDeleteAnimalDialog() {
        // TODO
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
}