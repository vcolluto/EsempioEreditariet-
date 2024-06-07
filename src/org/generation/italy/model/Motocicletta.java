package org.generation.italy.model;

public class Motocicletta extends Veicolo {		//sottoclasse di Veicolo
	private String cavalletto;
	
	
	public Motocicletta(String targa, String marca, String modello, int cilindrata, String cavalletto) throws Exception {
		super(targa, marca, modello, cilindrata);	//chiamata al costruttore di Veicolo
		if (!cavalletto.isBlank())
			this.cavalletto = cavalletto;
		else
			throw new Exception("Cavalletto non valido");
	}



	public void impenna() {
		System.out.println("WEEEEEE");
	}



	public String getCavalletto() {
		return cavalletto;
	}
	
	
	
}
