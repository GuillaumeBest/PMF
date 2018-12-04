package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panneau extends JPanel {
	private JLabel temperature;
	private JLabel humidite;
	private String temp;
	private String hum;
	
	
	public Panneau () {
	temperature = new JLabel();
	humidite = new JLabel();

// Default Texte
	temperature.setText("Température de la cannette: "+0+"°C");
	humidite.setText("Taux d'humidité: "+0+"%");
	
	this.add(temperature);
	this.add(humidite);
	}

//------------------------------------------------------------------------
	public void set(String temp, String hum) {
		setTemp(temp);
		setHum(hum);
		temperature.setText("Température de la cannette: "+getTemp()+"°C");
		humidite.setText("Taux d'humidité: "+getHum()+"%");
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
