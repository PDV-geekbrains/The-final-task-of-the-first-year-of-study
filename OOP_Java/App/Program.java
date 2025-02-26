package OOP_Java.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import OOP_Java.App.Core.Animal;
import OOP_Java.App.Presenters.AnimalPresenter;
import OOP_Java.App.View.View;

public class Program {
    public static void main(String[] args) {
        View ui = new View(new BufferedReader(new InputStreamReader(System.in)));

        ArrayList<Animal> animals = AnimalsListInit.InitAnimalsList();

        AnimalPresenter presenter = AnimalPresenter.GetInstance(ui, animals);
        presenter.DisplayMainMenu();
    }
}
