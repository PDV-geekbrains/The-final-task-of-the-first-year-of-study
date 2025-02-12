package OOP_Java.App.Core.Interfaces;

import java.util.List;

public interface IDomesticatedAnimal {
    String GetName();

    void SetName(String name);

    String GetBirthDate();

    void SetBirthDate(String birthDate);

    List<String> GetCommands();

    void SetCommand(String command);
}
