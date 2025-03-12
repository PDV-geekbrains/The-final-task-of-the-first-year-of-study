package OOP_Java.App.Utilities;

import java.util.LinkedList;

import OOP_Java.App.Models.Enums.AnimalCommands;

public class Util {
    /**
     * Returns comma separated commands.
     * 
     * @param commands Commands list.
     * @return String of inlined commands.
     */
    public static String SetCommandsInLine(LinkedList<AnimalCommands> commands) {
        StringBuilder sb = new StringBuilder();

        for (AnimalCommands command : commands) {
            if (!commands.isEmpty()) {
                if (sb.toString() == "") {
                    sb.append(command.toString());
                } else {
                    sb.append(", " + command.toString());
                }
            }
        }

        return sb.toString();
    }
}
