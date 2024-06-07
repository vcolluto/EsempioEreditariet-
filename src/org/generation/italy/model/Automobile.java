package org.generation.italy.model;


public class Automobile extends Veicolo { //sottoclasse di Veicolo
	public int dimensioniBagagliaio;
	
	public void accendiAriaCondizionata() {
		System.out.println("Aria condizionata ON");
	}
	
	public void spegniAriaCondizionata() {
		System.out.println("Aria condizionata OFF");
	}
}
