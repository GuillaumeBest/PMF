#include "DHT.h"

#define DHTPIN 2     // what digital pin we're connected to


#define DHTTYPE DHT22   // DHT 22  (AM2302), AM2321


DHT dht(DHTPIN, DHTTYPE);
  //Valeurs de a et b du calcul du point de rosée.
  float a = 17.27;
  float b = 237.7;
  
void setup() {
  Serial.begin(9600);
  //Serial.println("DHTxx test!");
  pinMode(3,OUTPUT);

  dht.begin();
}

void loop() {
  delay(1000);

  float h = dht.readHumidity();
  float t = dht.readTemperature();


  // Check if any reads failed and exit early (to try again).
  if (isnan(h) || isnan(t)) {
    Serial.println("Failed to read from DHT sensor!");
    return;
  }

  //Calcul du point de rosée lors du lancement du programme.
  float RH = h/100;
  float alpha = (a*t)/(b+t)+log(RH);
  float TR = b*alpha/(a-alpha);

  /*digitalWrite (3,HIGH);
  delay(20000);
  Serial.print(".");
  digitalWrite (3,LOW);
  delay(20000);*/
  
  while(t>=18.2) {
    //Lecture de la température (t) et de l'humidité (h)
    t = dht.readTemperature();
    h = dht.readHumidity();
    

    digitalWrite (3,HIGH);
    //affichage des valeurs température, humidité et point de rosée.
    Serial.print(t);
    Serial.print(";");
    Serial.print(h);
    Serial.print(";");
    Serial.print(TR);
    Serial.println();
    delay(2000);
  }
  
   
  
  
  while(17.8<t && t<18.2){
    
    //Lecture de la température (t) et de l'humidité (h)
    t = dht.readTemperature();
    h = dht.readHumidity();
    
    digitalWrite (3,HIGH);
    
     //affichage des valeurs température, humidité et point de rosée.
    Serial.print(t);
    Serial.print(";");
    Serial.print(h);
    Serial.print(";");
    Serial.print(TR);
    Serial.println();
    delay(2000);
  }
  
  
  while(t<=17.8){
    //Lecture de la température (t) et de l'humidité (h)
    t = dht.readTemperature();
    h = dht.readHumidity();

    digitalWrite (3,LOW);

     //affichage des valeurs température, humidité et point de rosée.
    Serial.print(t);
    Serial.print(";");
    Serial.print(h);
    Serial.print(";");
    Serial.print(TR);
    Serial.println();
    delay(2000);
  }
  
}
