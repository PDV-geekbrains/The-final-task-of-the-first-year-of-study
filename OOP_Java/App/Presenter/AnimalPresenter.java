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
    public String DisplayMenu_Main() {
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
        String result = "";
        switch (view.GetMenuItemUserChoice(sb.toString(), 8)) {
            case 1:

                break;

            default:
                break;
        }
public String DisplayMenu_AnimalByBirthday
    }
}
