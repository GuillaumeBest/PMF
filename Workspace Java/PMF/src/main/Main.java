package main;

import controller.Controller;
import model.Model;
import view.Fenetre;


public class Main {

	public static void main(String[] args) {
		Fenetre fen = new Fenetre();
		Model mod= new Model();
		Controller Control = new Controller(fen,mod,mod.getArdui()); 
		

	}

}
