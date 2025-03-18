package mvc;

/**
 * Interface for application factories in the MVC framework.
 */
public interface AppFactory {
    Model makeModel();  // Creates a new instance of the model

    View makeView(Model model, Controller controller, ViewPanel panel);  // Creates a new view

    String[] getEditCommands();  // Returns available commands

    Command makeEditCommand(Model model, String type);  // Creates a command based on input type

    String getTitle();  // Provides the application title

    String[] getHelp();  // Provides help text

    String about();  // Provides about information
}
