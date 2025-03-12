package OOP_Java.App.Presenters;

import java.util.ArrayList;

import OOP_Java.App.Models.Animal;
import OOP_Java.App.Models.Camel;
import OOP_Java.App.Models.Cat;
import OOP_Java.App.Models.Dog;
import OOP_Java.App.Models.Donkey;
import OOP_Java.App.Models.Hamster;
import OOP_Java.App.Models.Horse;
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
                DonkeyPresenter.DisplayDonkeyInfo((Donkey) animals.get(id), view);
                break;
        }
    }
}
