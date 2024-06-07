package org.generation.italy;

import org.generation.italy.model.Automobile;
import org.generation.italy.model.Motocicletta;
import org.generation.italy.model.Veicolo;

public class Main {

	public static void main(String[] args) {
		
		Veicolo v=new Veicolo();	//superclasse
		v.marca="Opel";
		v.modello="Astra";
					
		v.accendi();
		v.cilindrata=400;		//valore non valido!
		
		Veicolo t=new Veicolo();
		t.marca="Lamborghini";
		t.modello="8280 TTV";		//è un trattore
		t.accendi();
		t.accelera();				
		
		
		Automobile a=new Automobile();		//sottoclasse
		
		a.marca="Fiat";				//attributo di Veicolo (ereditato)
		a.modello="Panda";			//attributo di Veicolo (ereditato)
		a.dimensioniBagagliaio=200;	//attributo specifico di Automobile	
		
		a.accendi(); 				//metodo di Veicolo (ereditato)
		a.accelera(); 				//metodo di Veicolo (ereditato)
		a.accendiAriaCondizionata();//metodo specifico di Automobile
		
		Motocicletta m=new Motocicletta();	//sottoclasse
		
		m.marca="Kawasaki";			//attributo di Veicolo (ereditato)
		m.modello="Ninja";			//attributo di Veicolo (ereditato)
		m.accendi();				//metodo di Veicolo (ereditato)
		m.cavalletto="retrattile";	//attributo specifico di Motocicletta	
		m.impenna();				//metodo specifico di Motocicletta	
				
		
	}

}
