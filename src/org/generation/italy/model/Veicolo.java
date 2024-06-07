package org.generation.italy.model;

public class Veicolo {					//superclasse
	public String targa, marca, modello;		//private: sono visibili solo in Veicolo
	public int cilindrata;						//private: sono visibili solo in Veicolo
	
	
	
	
	

	public void accendi() {
		System.out.println("acceso");
	}
	
	public void spegni() {
		System.out.println("spento");
	}
	
	public void accelera() {
		System.out.println("sto accelerando");
	}
	
	public void decelera() {
		System.out.println("sto decelerando");
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

	
	
	
	
}
