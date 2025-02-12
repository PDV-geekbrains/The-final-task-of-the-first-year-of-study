package OOP_Java.App.Presenters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import OOP_Java.App.Core.Animal;
import OOP_Java.App.Core.Dog;
import OOP_Java.App.Core.DTOs.DogFullInfoDto;
import OOP_Java.App.View.View;

public class DogPresenter {
    private static DogPresenter instance = null;
    private AnimalPresenter animalPresenter;
    private View view;
    private ArrayList<Animal> animals;

    // Constructor.
    private DogPresenter(
            AnimalPresenter animalPresenter,
            View view,
            ArrayList<Animal> animals) {
        this.animalPresenter = animalPresenter;
        this.view = view;
        this.animals = animals;
    }

    /**
     * Method returns singleton of DogPresenter.
     * 
     * @param animalPresenter Link to instance of class AnimalPresenter.
     * @return Instance of class DogPresenter.
     */
    public static DogPresenter GetInstance(
            AnimalPresenter animalPresenter,
            View view,
            ArrayList<Animal> animals) {
        if (instance == null) {
            instance = new DogPresenter(animalPresenter, view, animals);
        }

        return instance;
    }

    public void DisplayAddAnimalDialog() {
        // TODO
    }

    /**
     * Displays full info about a dog.
     * 
     * @param concreteDog
     */
    public void DisplayDogInfo(Dog concreteDog) {
        view.DisplayMessage(FormatDogInfo(concreteDog.GetFullInfo()));
    }

    /** Generates a report to display to a user. */
    private String FormatDogInfo(DogFullInfoDto dto) {
        StringBuilder text = new StringBuilder()
                .append(("--- Dog info ---\n"))
                .append("Animal type: " + dto.animalType().toString() + "\n")
                .append("Pet kind: " + dto.petKind() + "\n")
                .append("Weight: " +
                        (dto.weight() > 0 ? dto.weight() : "") + "\n")
                .append("Owner home address: " + dto.ownerHomeAddress() + "\n")
                .append("Name: " + dto.name() + "\n")
                .append("Birth date: " + dto.birthDate() + "\n")
                .append("Commands: " + GetFormattedCommandsList(dto.commands()) + "\n")
                .append("Tracking degree: " +
                        (dto.trackingDegree() != null ? dto.trackingDegree() : "") + "\n");

        return text.toString();
    }

    /** Returns commands separated by spaces. */
    private String GetFormattedCommandsList(LinkedList<String> commands) {
        String s = "";
        if (!commands.isEmpty()) {
            Iterator<String> iterator = commands.iterator();
            while (iterator.hasNext()) {
                s = s + iterator.next() + " ";
            }
        }
        return s;
    }
}
