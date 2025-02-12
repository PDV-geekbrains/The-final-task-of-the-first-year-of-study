package OOP_Java.App.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.InputMismatchException;

/** Displays data to console interactively. */
public class View {
    BufferedReader reader;

    /**
     * Конструктор.
     * 
     * @param reader - ридер для чтения с консоли.
     */
    public View(BufferedReader reader) {
        this.reader = reader;
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
            result = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.print("Error. Please enter integer number.\n");
            GetMenuItemUserChoice(menu, maxItemNumber);
        } catch (IOException e) {
            // TODO
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
     * @return User entered number or -1 if input is not correct.
     */
    public int GetUserIntValueInput(String message) {
        System.out.print(message);
        int input = -1;

        // Correct user input is any integer that equal or greater 0.
        try {
            input = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.print("Error. Please enter correct animal ID. Animal ID is integer.\n");
        } catch (IOException e) {
            // TODO
        }

        return input;
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

    /**
     * Displays a message to console.
     * 
     * @param message A message to display.
     */
    public void DisplayMessage(String message) {
        System.out.println(message);
    }
}
