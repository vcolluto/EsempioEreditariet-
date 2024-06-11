package org.generation.italy.model;

public class Veicolo {					//superclasse
	private String targa, marca, modello;		//private: sono visibili solo in Veicolo
	private int cilindrata;						//private: sono visibili solo in Veicolo
	private int velocità;

	public Veicolo(String targa, String marca, String modello, int cilindrata) throws Exception {
		super();	//chiamo il costruttore di Object (la classe "padre di tutti")
		if (!targa.isBlank() && targa.length()>7)
			this.targa = targa;
		else
			throw new Exception("Targa non valida");
		
		if (!marca.isBlank())
			this.marca = marca;
		else
			throw new Exception("Marca non valida");
		
		if (!modello.isBlank())
			this.modello = modello;
		else
			throw new Exception("Modello non valido");
		
		if (cilindrata>0)
			this.cilindrata = cilindrata;
		else
			throw new Exception("Cilindrata non valida");
		velocità=0;
	}
	
	public Veicolo(String targa, String marca, String modello) throws Exception {
		this(targa, marca, modello, 1000);		//chiamo la versione del costruttore con 4 parametri, impostando il valore di cindrata di default (1000)
	}

	public void accendi() {
		System.out.println("acceso");
	}
	
	public void spegni() {
		System.out.println("spento");
	}
	
	public void accelera() {
		if (velocità<250)
			velocità++;		//accelero di 1 km/h
		System.out.println("sto accelerando");
	}
	
	public void decelera() {
		if (velocità>0)
			velocità--;		//decelero di 1 km/h
		System.out.println("sto decelerando");
	}
	
	public void accelera(int n) {						//metodo in "overloading"
		if (velocità<250-n)
			velocità+=n;		//accelero di n km/h
		System.out.println("sto accelerando");
	}

	public void accelera(String quanto) {				//metodo in "overloading"
		if (quanto.equals("poco"))
			velocità+=2;		//accelero di 2 km/h
		else if (quanto.equals("abbastanza"))
			velocità+=5;		//accelero di 2 km/h
		else if (quanto.equals("molto"))
			velocità+=15;		//accelero di 2 km/h
		System.out.println("sto accelerando");
	}
	
	public String getTarga() {
		return targa;
	}

	

	public String getMarca() {
		return marca;
	}

	
	public String getModello() {
		return modello;
	}

	

	public int getCilindrata() {
		return cilindrata;
	}

	public int getVelocità() {
		return velocità;
	}

	
	
	
	
}
