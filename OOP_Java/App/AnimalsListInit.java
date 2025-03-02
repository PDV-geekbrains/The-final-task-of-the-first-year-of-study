package OOP_Java.App;

import java.util.ArrayList;

import OOP_Java.App.Core.Animal;
import OOP_Java.App.Core.Dog;
import OOP_Java.App.Core.Enums.AnimalCommands;
import OOP_Java.App.Core.Enums.DogTrackingDegrees;

/**
 * Utility class.
 */
public class AnimalsListInit {
    private static ArrayList<Animal> animals = new ArrayList<Animal>();

    /** Creates partly populated list of animals. */
    public static ArrayList<Animal> InitAnimalsList() {
        // Dogs.
        animals.add(new Dog()
                .SetTrackingDegree(DogTrackingDegrees.EXCELLENT)
                .SetOwnerHomeAddress("ул. Цветочная, 11")
                .SetName("Черныш")
                .SetBirthDate("2020-01-01")
                .SetCommand(AnimalCommands.SPEAK)
                .SetCommand(AnimalCommands.FETCH)
                .SetWeight(7.3f));
        animals.add(new Dog()
                .SetTrackingDegree(DogTrackingDegrees.ALREADY_QUITE)
                .SetOwnerHomeAddress("ул. Грибная, 13")
                .SetName("Чарли")
                .SetBirthDate("2019-14-10")
                .SetCommand(AnimalCommands.SPEAK)
                .SetCommand(AnimalCommands.SIT)
                .SetWeight(5.1f));
        animals.add(new Dog()
                .SetTrackingDegree(DogTrackingDegrees.A_LITTLE_WEEK)
                .SetOwnerHomeAddress("ул. Центральная, 117")
                .SetName("Бадди")
                .SetBirthDate("2020-11-13")
                .SetCommand(AnimalCommands.SIT)
                .SetCommand(AnimalCommands.DOWN)
                .SetWeight(6.0f));
        // Cats.
        // Hamsters.
        // Horses.
        // Camels.
        // Donkeys.

        return animals;
    }
}
