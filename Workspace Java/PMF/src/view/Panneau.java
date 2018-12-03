package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panneau extends JPanel {
	
	public Panneau () {
	JLabel temp = new JLabel();
	JLabel humidite = new JLabel();
	temp.setText("Température de la cannette: "+12+"°C");
	int val = 0;
	humidite.setText("Taux d'humidité: "+val+"%");
	this.add(temp);
	this.add(humidite);
	}

}
