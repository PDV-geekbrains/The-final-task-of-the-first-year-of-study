package OOP_Java.App.Presenter;

import java.util.List;

import OOP_Java.App.Core.Animal;
import OOP_Java.App.View.View;

public class AnimalPresenter {
    private View view;
    private List<Animal> animals;

    public AnimalPresenter(View view, List<Animal> animals) {
        this.view = view;
        this.animals = animals;
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
            case 1:
                DisplayListOfAnimals();
                break;
            case 2:
                DisplayAnimalsByBirthday();
                break;
            case 3:
                DisplayTotalAnimalQuantity();
                break;
            case 4:
                DisplayAddAnimalDialog();
                break;
            case 5:
                DisplayGetAnimalInfoDialog();
                break;
            case 6:
                DisplayEditAnimalDialog();
                break;
            case 7:
                DisplayDeleteAnimalDialog();
                break;
            case 8:
                System.exit(0);
            default:
                break;
        }
    }

    private void DisplayListOfAnimals() {
        // TODO
    }

    private void DisplayAnimalsByBirthday() {
        // TODO
    }

    private void DisplayTotalAnimalQuantity() {
        // TODO
    }

    private void DisplayAddAnimalDialog() {
        // TODO
    }

    private void DisplayGetAnimalInfoDialog() {
        // TODO
    }

    private void DisplayEditAnimalDialog() {
        // TODO
    }

    private void DisplayDeleteAnimalDialog() {
        // TODO
    }
}