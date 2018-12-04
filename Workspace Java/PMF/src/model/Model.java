package model;

public class Model {
	ArduinoJava arduino;
	
	public Model() {
		arduino= new ArduinoJava();
		arduino.initialize();
	}
	
	public ArduinoJava getArdui() {
		return arduino;
		
	}

}
