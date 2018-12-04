package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panneau extends JPanel {
	private JLabel temperature;
	private JLabel textT;
	private JLabel humidite;
	private JLabel textH;
	private JLabel textC;
	private JTextField consigne;
	
	private String temp;
	private String hum;
	
	
	public Panneau () {
		
	JPanel display= new JPanel ();
	this.setLayout(new BorderLayout());
	
	
// Display NORTH
	display.setLayout(new GridLayout(3,2));
	temperature = new JLabel();
	textT = new JLabel();
	
	humidite = new JLabel();
	textH = new JLabel();
	
	consigne=  new JTextField();
	textC = new JLabel();

	textT.setText("Température de la cannette:");
	temperature.setText("?°C");
	
	textH.setText("Taux d'humidité:");
	temperature.setText("?%");
	
	textC.setText("Température de Consigne: ");
	consigne.setText("18.2");
	
	display.add(textT);
	display.add(temperature);
	display.add(textH);
	display.add(humidite);
	display.add(textC);
	display.add(consigne);
	this.add(display,BorderLayout.NORTH);
	}

//------------------------------------------------------------------------
	public void set() {
		temperature.setText(getTemp()+"°C");
		humidite.setText(getHum()+"%");
	}

//------------------------------------------------------------------------
	public JLabel getTemperature() {
		return temperature;
	}
	public void setTemperature(JLabel temperature) {
		this.temperature = temperature;
	}
	
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	
	public JLabel getHumidite() {
		return humidite;
	}
	public void setHumidite(JLabel humidite) {
		this.humidite = humidite;
	}

	
	public String getHum() {
		return hum;
	}

	public void setHum(String hum) {
		this.hum = hum;
	}

}
