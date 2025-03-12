package OOP_Java.App.Utilities;

import java.util.ArrayList;

import OOP_Java.App.Models.Animal;
import OOP_Java.App.Models.Camel;
import OOP_Java.App.Models.Cat;
import OOP_Java.App.Models.Dog;
import OOP_Java.App.Models.Donkey;
import OOP_Java.App.Models.Hamster;
import OOP_Java.App.Models.Horse;
import OOP_Java.App.Models.Enums.AnimalKinds;
import OOP_Java.App.Models.Interfaces.IDomesticatedAnimal;
import OOP_Java.App.Presenters.CamelPresenter;
import OOP_Java.App.Presenters.CatPresenter;
import OOP_Java.App.Presenters.DogPresenter;
import OOP_Java.App.Presenters.DomesticatedAnimalPresenter;
import OOP_Java.App.Presenters.DonkeyPresenter;
import OOP_Java.App.Presenters.HamsterPresenter;
import OOP_Java.App.Presenters.HorsePresenter;
import OOP_Java.App.View.View;

public class AnimalFactory {
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
                Camel camel = new Camel();
                animal = DomesticatedAnimalPresenter.AddInfoToDomesticatedAnimal(camel, view);
                camel = CamelPresenter.AddInfoToCamel((Camel) animal, view);
                animals.add(camel);
                break;
            case DONKEY:
                Donkey donkey = new Donkey();
                animal = DomesticatedAnimalPresenter.AddInfoToDomesticatedAnimal(donkey, view);
                donkey = DonkeyPresenter.AddInfoToDonkey((Donkey) animal, view);
                animals.add(donkey);
                break;
        }
    }
}
