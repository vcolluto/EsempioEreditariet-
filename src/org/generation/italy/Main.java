package org.generation.italy;

import org.generation.italy.model.Automobile;
import org.generation.italy.model.Motocicletta;
import org.generation.italy.model.Veicolo;

public class Main {

	public static void main(String[] args) {
		
		
		try {
			Veicolo v=new Veicolo("EF434323","Opel", "Astra",1700);	//superclasse (Veicolo generico)						
			v.accendi();
			v.accelera();
			v.decelera();			
			
			
			Veicolo t=new Veicolo("DE455643","Lamborghini", "8280 TTV", 2000);	//superclasse (Veicolo generico)			
			t.accendi();
			t.accelera();		
			
			Automobile a=new Automobile("FA243243", "Fiat", "Panda", 1300, 250);		//sottoclasse
			
			a.accendi(); 				//metodo di Veicolo (ereditato)
			a.accelera(); 				//metodo di Veicolo (ereditato)
			a.accendiAriaCondizionata();//metodo specifico di Automobile
			
			Motocicletta m=new Motocicletta("DY432433","Kawasaki","Ninja", 750, "retrattile");	//sottoclasse
		} catch (Exception e) {
			System.err.println("Errore: "+e.getMessage());
		}
		
		
				
		
	}

}
