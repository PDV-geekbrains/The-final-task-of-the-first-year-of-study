package OOP_Java.App.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.regex.Pattern;

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
        String input = "";
        int result = 0;
        boolean isValid = false;

        do {
            System.out.print(menu);
            try {
                input = reader.readLine();
                result = Integer.parseInt(input);
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.print("Error. You have entered \"" + input +
                        "\". Enter integer.\n");
                isValid = false;
            } catch (IOException e) {
                System.out.print("Error. Unexpected error occurred. Try again.\n");
                isValid = false;
            }

            if (result > maxItemNumber) {
                System.out.print("Error. You have entered \"" + input +
                        "\". Maximum menu item is \"" + maxItemNumber + "\". Try again.\n");
                isValid = false;
            }
        } while (!isValid);

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
        float input = 0;

        do {
            System.out.print(message);
            try {
                input = Float.parseFloat(reader.readLine());
                if (input <= 0) {
                    System.out.print("Error. Weight must be more than 0.");
                }
            } catch (NumberFormatException e) {
                System.out.print("Error. Please enter correct weight.\n");
            } catch (IOException e) {
                // TODO
            }
        } while (input <= 0);

        return input;
    }

    /**
     * Gets user input of string value.
     * 
     * @param message Message displayed for user.
     * @return User entered string.
     */
    public String GetUserStringValueInput(String message) {
        String input = "";

        System.out.print(message);
        try {
            input = reader.readLine();
        } catch (IOException e) {
            // TODO
        }

        return input;
    }

    /**
     * Gets date in format YYYY-MM-DD.
     * 
     * @param message Message displayed to a user.
     * @return Date in format YYYY-MM-DD.
     */
    public String GetUserDataInput(String message) {
        String input = "";
        boolean isInputNotValid = true;

        while (isInputNotValid) {
            System.out.print(message);
            try {
                input = reader.readLine();
                if (input.length() == 10 &&
                        input.matches("(\\d{4})(-)(\\d{2})(-)(\\d{2})")) {
                    isInputNotValid = false;
                } else {
                    System.out.print("Error. You entered \"" + input + "\". " +
                            "Please enter date correct.\n");
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        return input;
    }

    /**
     * Displays a message to console.
     * 
     * @param message A message to display.
     */
    public void DisplayMessage(String message) {
        System.out.println(message);
    }

    /** Cleans terminal screen. */
    public void CleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
