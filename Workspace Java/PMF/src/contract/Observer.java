package contract;

import model.ArduinoJava;

public abstract class Observer {
	protected ArduinoJava ardui;
	public abstract void update();
}
