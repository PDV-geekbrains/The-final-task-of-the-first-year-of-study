package OOP_Java.App;

import java.util.ArrayList;

import OOP_Java.App.Core.Animal;
import OOP_Java.App.Core.Dog;

/**
 * Utility class.
 */
public class AnimalsListInit {
    private static ArrayList<Animal> animals = new ArrayList<Animal>();

    /** Creates partly populated list of animals. */
    public static ArrayList<Animal> InitAnimalsList() {
        // Dogs.
        animals.add(new Dog(
                "Черныш",
                "2020-01-01",
                "ул. Цветочная, 11"));
        animals.add(new Dog(
                "Чарли",
                "2019-14-10",
                "ул. Грибная, 13"));
        // Cats.
        // Hamsters.
        // Horses.
        // Camels.
        // Donkeys.

        return animals;
    }
}
