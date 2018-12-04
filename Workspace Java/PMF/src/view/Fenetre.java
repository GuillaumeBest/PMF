package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;


public class Fenetre extends JFrame {
	
	private Panneau pan; 

	public Fenetre () {  
		pan =  new Panneau();
		this.setTitle("Console Mini Frigo USB");
		this.setSize(350, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(pan);
		this.setVisible(true);
	  }
	
	public Panneau getPan() {
		return pan;
	}

	public void setPan(Panneau pan) {
		this.pan = pan;
	}
	
}
