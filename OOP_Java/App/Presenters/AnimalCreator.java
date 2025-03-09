package OOP_Java.App.Presenters;

import java.util.ArrayList;

import OOP_Java.App.Core.Animal;
import OOP_Java.App.Core.Cat;
import OOP_Java.App.Core.Dog;
import OOP_Java.App.Core.Hamster;
import OOP_Java.App.Core.Horse;
import OOP_Java.App.Core.Enums.AnimalKinds;
import OOP_Java.App.Core.Interfaces.IDomesticatedAnimal;
import OOP_Java.App.View.View;

public class AnimalCreator {
    public static void Create(
            AnimalKinds animalKind,
            View view,
            ArrayList<Animal> animals) {
        IDomesticatedAnimal animal;
        switch (animalKind) {
            case DOG:
                Dog dog = new Dog();
                animal = DomesticatedAnimalPresenter.AddInfoToDomesticatedAnimal(dog, view);
                dog = DogPresenter.AddInfoToDog((Dog) animal, view);
                animals.add(dog);
                break;
            case CAT:
                Cat cat = new Cat();
                animal = DomesticatedAnimalPresenter.AddInfoToDomesticatedAnimal(cat, view);
                cat = CatPresenter.AddInfoToCat((Cat) animal, view);
                animals.add(cat);
                break;
            case HAMSTER:
                Hamster hamster = new Hamster();
                animal = DomesticatedAnimalPresenter.AddInfoToDomesticatedAnimal(hamster, view);
                hamster = HamsterPresenter.AddInfoToHamster((Hamster) animal, view);
                animals.add(hamster);
                break;
            case HORSE:
                Horse horse = new Horse();
                animal = DomesticatedAnimalPresenter.AddInfoToDomesticatedAnimal(horse, view);
                horse = HorsePresenter.AddInfoToHorse((Horse) animal, view);
                animals.add(horse);
                break;
            case CAMEL:
                // TODO
                break;
            case DONKEY:
                // TODO
                break;
        }
    }
}
