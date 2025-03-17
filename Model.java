package mvc;

import java.io.*;
import java.util.*;

/**
 * Super class of any class playing the role of Model in the
 * Model-View-Controller pattern.
 * @author pearce
 *
 */
public class Model extends Observable implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * file where this model will be saved
	 */
	private File file;
	/**
	 * true if changes have been made to this model that need to be saved
	 * before exiting or opening a new model
	 */
	private boolean changed = false;

	public File getFile() {
		return file;
	}
	public void setFile(File newFile) {
		file = newFile;
	}
	public boolean isChanged() {
		return changed;
	}

	public void setChanged(boolean changed) {
		this.changed = changed;
	}

	/**
	 * notifies observers of changes and sets changed flag to true
	 */
	public void setChanged() {
		super.setChanged();
		this.notifyObservers();
		this.changed = true;
	}
}
