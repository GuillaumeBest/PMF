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
		System.out.println("Salut l'update fonctionne");
		fen.getPan().set(ardui.getTemp(),ardui.getHum());
		
	}

}
