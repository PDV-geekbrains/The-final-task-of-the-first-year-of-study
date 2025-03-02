package OOP_Java.App.Core.Interfaces;

import java.util.List;

import OOP_Java.App.Core.Animal;
import OOP_Java.App.Core.Enums.AnimalCommands;

public interface IDomesticatedAnimal {
    String GetName();

    Animal SetName(String name);

    String GetBirthDate();

    Animal SetBirthDate(String birthDate);

    List<AnimalCommands> GetCommands();

    Animal SetCommand(AnimalCommands command);
}
