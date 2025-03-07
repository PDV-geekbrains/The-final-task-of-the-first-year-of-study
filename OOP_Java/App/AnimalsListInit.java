package OOP_Java.App;

import java.util.ArrayList;

import OOP_Java.App.Core.Animal;
import OOP_Java.App.Core.Cat;
import OOP_Java.App.Core.Dog;
import OOP_Java.App.Core.Hamster;
import OOP_Java.App.Core.Enums.AnimalCommands;
import OOP_Java.App.Core.Enums.CatClimbingDegrees;
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
                                .SetOwnerHomeAddress("Queen st., 11")
                                .SetName("Roxy")
                                .SetBirthDate("2020-01-01")
                                .SetCommand(AnimalCommands.SPEAK)
                                .SetCommand(AnimalCommands.FETCH)
                                .SetWeight(7.3f));
                animals.add(new Cat()
                                .SetClimbingDegree(CatClimbingDegrees.NOT_BAD)
                                .SetOwnerHomeAddress("Ford st., 8")
                                .SetName("Molly")
                                .SetBirthDate("2019-03-07")
                                .SetCommand(AnimalCommands.JUMP)
                                .SetWeight(2.1f));
                animals.add(new Hamster()
                                .SetStoredFeedAmount(0.01f)
                                .SetOwnerHomeAddress("Horton st., 18")
                                .SetName("Bandit")
                                .SetBirthDate("2023-05-27")
                                .SetCommand(AnimalCommands.HIDE)
                                .SetWeight(0.2f));
                animals.add(new Cat()
                                .SetClimbingDegree(CatClimbingDegrees.NOT_REALLY_YET)
                                .SetOwnerHomeAddress("York st., 2")
                                .SetName("Rosie")
                                .SetBirthDate("2021-08-26")
                                .SetCommand(AnimalCommands.FETCH)
                                .SetWeight(1.3f));
                animals.add(new Dog()
                                .SetTrackingDegree(DogTrackingDegrees.ALREADY_QUITE)
                                .SetOwnerHomeAddress("Fountain st., 13")
                                .SetName("Max")
                                .SetBirthDate("2019-14-10")
                                .SetCommand(AnimalCommands.SPEAK)
                                .SetCommand(AnimalCommands.SIT)
                                .SetWeight(5.1f));
                animals.add(new Hamster()
                                .SetStoredFeedAmount(0.025f)
                                .SetOwnerHomeAddress("Rose st., 17")
                                .SetName("Frodo")
                                .SetBirthDate("2022-06-06")
                                .SetCommand(AnimalCommands.STAY)
                                .SetWeight(0.3f));
                animals.add(new Dog()
                                .SetTrackingDegree(DogTrackingDegrees.A_LITTLE_WEEK)
                                .SetOwnerHomeAddress("Regent st., 7")
                                .SetName("Daisy")
                                .SetBirthDate("2020-11-13")
                                .SetCommand(AnimalCommands.SIT)
                                .SetCommand(AnimalCommands.DOWN)
                                .SetWeight(6.0f));
                animals.add(new Cat()
                                .SetClimbingDegree(CatClimbingDegrees.GREAT)
                                .SetOwnerHomeAddress("Market st., 2")
                                .SetName("Millie")
                                .SetBirthDate("2018-09-18")
                                .SetCommand(AnimalCommands.JUMP)
                                .SetWeight(1.3f));
                // Hamsters.
                // Horses.
                // Camels.
                // Donkeys.

                return animals;
        }
}
