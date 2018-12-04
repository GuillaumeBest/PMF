package controller;

import contract.Observer;
import model.ArduinoJava;
import model.Model;
import view.Fenetre;

public class Controller extends Observer{
	public Fenetre fen;
	public Controller(Fenetre fen, Model mod, ArduinoJava ardui) {
		this.ardui = ardui;
	    this.ardui.attach(this);
	    this.fen=fen;
	}

	@Override
	public void update() {
		fen.getPan().setTemp(ardui.getTemp());
		fen.getPan().setHum(ardui.getHum());
		fen.getPan().set();
		
	}

}
