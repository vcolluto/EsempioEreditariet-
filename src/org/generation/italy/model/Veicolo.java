package org.generation.italy.model;

public class Veicolo {					//superclasse
	private String targa, marca, modello;		//private: sono visibili solo in Veicolo
	private int cilindrata;						//private: sono visibili solo in Veicolo

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
	}

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
