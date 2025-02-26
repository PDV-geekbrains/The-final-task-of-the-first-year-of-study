package OOP_Java.App.Core.Interfaces;

import java.util.List;

import OOP_Java.App.Core.Enums.AnimalCommands;

public interface IDomesticatedAnimal {
    String GetName();

    void SetName(String name);

    String GetBirthDate();

    void SetBirthDate(String birthDate);

    List<AnimalCommands> GetCommands();

    void SetCommand(AnimalCommands command);
}
