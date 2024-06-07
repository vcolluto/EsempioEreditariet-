package org.generation.italy.model;

//per creare un oggetto della sottoclasse è necessario prima creare un oggetto della superclasse
// se in Veicolo esiste un costruttore senza parametri, questo viene chiamato in maniera trasparente quando si crea un Automobile
// se in Veicolo non esiste un costruttore senza parametri (esplicito o implicito) allora il costruttore di Automobile deve chiamare il costruttore parametrico di Veicolo, "passando" i valori validi 
public class Automobile extends Veicolo { //sottoclasse di Veicolo
	private int dimensioniBagagliaio;
	

	public int getDimensioniBagagliaio() {
		return dimensioniBagagliaio;
	}

	public Automobile(String targa, String marca, String modello, int cilindrata, int dimensioniBagagliaio)
		throws Exception {
		
		//bisogna creare un oggetto Veicolo
		super(targa, marca, modello, cilindrata);	//chiamata al costruttore della superclasse (Veicolo)
		
		if (dimensioniBagagliaio>0)
			this.dimensioniBagagliaio = dimensioniBagagliaio;	//imposto l'attributo specifico di Automobile
		else
			throw new Exception("Dimensione bagagliaio non valida");
	}

	public void accendiAriaCondizionata() {
		System.out.println("Aria condizionata ON");
	}
	
	public void spegniAriaCondizionata() {
		System.out.println("Aria condizionata OFF");
	}
}
