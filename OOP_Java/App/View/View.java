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

    /** Выводит на консоль главное меню. */
    public int mainMenu() {

        StringBuilder menu = new StringBuilder()
                .append("=== Меню ===\n")
                .append("1 - Сложение\n")
                .append("2 - Вычитание\n")
                .append("3 - Умножение\n")
                .append("4 - Деление\n")
                .append("Введите номер операции: ");
        System.out.print(menu);
        return getMenuItem();
    }

    /** Возвращает номер меню, выбранный пользователем. */
    private int getMenuItem() {
        int result = 0;
        try {
            result = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return result;
    }

    /**
     * Возвращает значение, введённое пользователем.
     * 
     * @param text - обращение к пользователю выводимое на консоль.
     */
    public double getUserInput(String text) {
        System.out.print(text);
        double input = 0;
        try {
            input = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return input;
    }

    /**
     * Выводит текст на консоль.
     * 
     * @param text - текст для вывода.
     */
    public void print(String text) {
        System.out.println(text + "\n");
    }
}
