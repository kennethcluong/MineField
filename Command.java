package mvc;

import java.io.Serializable;

/**
 * Abstract class representing a command in the MVC framework.
 */
public abstract class Command implements Serializable {
    private static final long serialVersionUID = 1L;
    protected Model model;

    public Command(Model model) {
        this.model = model;
    }

    // Execute the command
    public abstract void execute();

    // Undo the command (optional implementation)
    public void undo() {
        throw new UnsupportedOperationException("Undo not supported for this command.");
    }
}
