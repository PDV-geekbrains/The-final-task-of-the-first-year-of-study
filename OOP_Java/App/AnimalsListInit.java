package OOP_Java.App;

import java.util.ArrayList;

import OOP_Java.App.Core.Animal;
import OOP_Java.App.Core.Camel;
import OOP_Java.App.Core.Cat;
import OOP_Java.App.Core.Dog;
import OOP_Java.App.Core.Hamster;
import OOP_Java.App.Core.Horse;
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
                animals.add(new Horse()
                                .SetLoadCapacity(550)
                                .SetMaxSpeed(55)
                                .SetName("Mercury")
                                .SetBirthDate("2018-11-13")
                                .SetCommand(AnimalCommands.STAY)
                                .SetCommand(AnimalCommands.GO)
                                .SetWeight(280f));
                animals.add(new Cat()
                                .SetClimbingDegree(CatClimbingDegrees.NOT_BAD)
                                .SetOwnerHomeAddress("Ford st., 8")
                                .SetName("Molly")
                                .SetBirthDate("2019-03-07")
                                .SetCommand(AnimalCommands.JUMP)
                                .SetWeight(2.1f));
                animals.add(new Camel()
                                .SetLoadCapacity(730)
                                .SetWithoutWaterPeriod(10)
                                .SetName("Ibil")
                                .SetBirthDate("2013-12-14")
                                .SetCommand(AnimalCommands.STAY)
                                .SetCommand(AnimalCommands.DOWN)
                                .SetWeight(220f));
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
                animals.add(new Horse()
                                .SetLoadCapacity(820)
                                .SetMaxSpeed(35)
                                .SetName("Duke")
                                .SetBirthDate("2014-08-28")
                                .SetCommand(AnimalCommands.STAY)
                                .SetCommand(AnimalCommands.RIGHT)
                                .SetCommand(AnimalCommands.LEFT)
                                .SetWeight(400f));
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
                animals.add(new Horse()
                                .SetLoadCapacity(1000)
                                .SetMaxSpeed(20)
                                .SetName("Titanium")
                                .SetBirthDate("2012-11-05")
                                .SetCommand(AnimalCommands.STAY)
                                .SetCommand(AnimalCommands.GO)
                                .SetCommand(AnimalCommands.FASTER)
                                .SetWeight(550f));
                animals.add(new Camel()
                                .SetLoadCapacity(220)
                                .SetWithoutWaterPeriod(13)
                                .SetName("Hijen")
                                .SetBirthDate("2011-04-17")
                                .SetCommand(AnimalCommands.STAY)
                                .SetCommand(AnimalCommands.GO)
                                .SetCommand(AnimalCommands.FASTER)
                                .SetWeight(310f));
                return animals;
        }
}
