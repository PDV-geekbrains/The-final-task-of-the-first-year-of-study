package OOP_Java.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import OOP_Java.App.Core.Animal;
import OOP_Java.App.Core.Dog;
import OOP_Java.App.Presenters.AnimalPresenter;
import OOP_Java.App.View.View;

public class Program {
    public static void main(String[] args) {
        View ui = new View(new BufferedReader(new InputStreamReader(System.in)));

        ArrayList<Animal> animals = InitAnimalsList();
        AnimalPresenter presenter = AnimalPresenter.GetInstance(ui, animals);
        presenter.DisplayMainMenu();
    }

    /** Creates partly populated list of animals. */
    private static ArrayList<Animal> InitAnimalsList() {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        // Dog.
        animals.add(new Dog(
                "Черныш",
                "2020-01-01",
                "ул. Цветочная, 11"));
        // Cat.
        // Hamster.
        // Horse.
        // Camel.
        // Donkey.

        return animals;
    }
}
