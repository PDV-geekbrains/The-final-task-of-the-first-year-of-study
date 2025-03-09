package OOP_Java.App.Presenters;

import java.util.ArrayList;

import OOP_Java.App.Core.Animal;
import OOP_Java.App.Core.Camel;
import OOP_Java.App.Core.Cat;
import OOP_Java.App.Core.Dog;
import OOP_Java.App.Core.Hamster;
import OOP_Java.App.Core.Horse;
import OOP_Java.App.View.View;

public class AnimalInfoPresenter {

    public static void DisplayAnimalInfo(
            int id,
            View view,
            ArrayList<Animal> animals) {

        view.CleanScreen();
        switch (animals.get(id).GetAnimalKind()) {
            case DOG:
                DogPresenter.DisplayDogInfo((Dog) animals.get(id), view);
                break;
            case CAT:
                CatPresenter.DisplayCatInfo((Cat) animals.get(id), view);
                break;
            case HAMSTER:
                HamsterPresenter.DisplayHamsterInfo((Hamster) animals.get(id), view);
                break;
            case HORSE:
                HorsePresenter.DisplayHorseInfo((Horse) animals.get(id), view);
                break;
            case CAMEL:
                CamelPresenter.DisplayCamelInfo((Camel) animals.get(id), view);
                break;
            case DONKEY:
                // TODO
                break;
        }
    }
}
