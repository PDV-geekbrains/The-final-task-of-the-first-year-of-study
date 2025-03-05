package OOP_Java.App.Presenters;

import java.util.ArrayList;

import OOP_Java.App.Core.Animal;
import OOP_Java.App.Core.Dog;
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
                // TODO
                break;
            case HAMSTER:
                // TODO
                break;
            case HORSE:
                // TODO
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
