package OOP_Java.App.View;

import java.util.Scanner;

public class View {
    Scanner sc;

    /**
     * Конструктор.
     * 
     * @param scanner - сканер для чтения ввода с консоли.
     */
    public View(Scanner scanner) {
        this.sc = scanner;
    }

    /**
     * Get menu item user selected.
     * 
     * @param menu          Menu caption and contents.
     * @param maxItemNumber Maximum menu item number.
     * @return Selected menu item number.
     */
    public int GetMenuItemUserChoice(String menu, int maxItemNumber) {
        System.out.print(menu);
        int result = 0;

        try {
            result = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.print("Error. Please enter integer number.\n");
            GetMenuItemUserChoice(menu, maxItemNumber);
        }

        if (result > maxItemNumber) {
            System.out.print("Error. Entered number exceeds maximum value.\n");
            GetMenuItemUserChoice(menu, maxItemNumber);
        }

        return result;
    }

    /**
     * Get user input of integer number.
     * 
     * @param message Message displayed for user.
     * @return User entered number.
     */
    public int GetUserIntValueInput(String message) {
        // TODO
        return 0;
    }

    /**
     * Get user input of floating-point number.
     * 
     * @param message Message displayed for user.
     * @return User entered number.
     */
    public float GetUserDoubleValueInput(String message) {
        // TODO
        return 0;
    }

    /**
     * Get user input of string value.
     * 
     * @param message Message displayed for user.
     * @return User entered string.
     */
    public String GetUserStringValueInput(String message) {
        // TODO.
        return "__";
    }
}
