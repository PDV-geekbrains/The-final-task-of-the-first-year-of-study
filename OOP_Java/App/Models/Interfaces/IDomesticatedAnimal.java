package OOP_Java.App.Models.Interfaces;

import java.util.LinkedList;

import OOP_Java.App.Models.Animal;
import OOP_Java.App.Models.Enums.AnimalCommands;

public interface IDomesticatedAnimal {
    String GetName();

    Animal SetName(String name);

    String GetBirthDate();

    Animal SetBirthDate(String birthDate);

    LinkedList<AnimalCommands> GetCommands();

    Animal SetCommand(AnimalCommands command);
}