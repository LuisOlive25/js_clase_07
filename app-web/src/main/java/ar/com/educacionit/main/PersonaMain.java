package ar.com.educacionit.main;

import ar.com.educacionit.entidades.Persona;
import ar.com.educacionit.exception.checked.NoSabeException;
import ar.com.educaionit.entidades.Espanol;
import ar.com.educaionit.entidades.Ingles;
import ar.com.educaionit.entidades.Portugues;


public class PersonaMain {

	public static void main(String[] args) {
		
		
		System.out.println("Hola MUndo");

		
		Persona p1 = new Persona();
		Persona p2 = new Persona("Pedro", "Rodriguez", new Espanol());
		System.out.println(p1);
		System.out.println(p1.toString());
		System.out.println(p2);
		
		Ingles il = new Ingles();
		Portugues pl = new Portugues();
		
		Persona p3 = new Persona("Laura", "Gimenez", il);
        System.out.println(p3);
		
		
		p2.aprender(il);
		
		System.out.println(p2);
		
		p2.aprender(pl);
		
		
		
		p2.decir("palabra");
		p3.decir("palabra");
				
		System.out.println(p2);
		
		// Espanol espa = new Espanol();
		
		// p3.aprender(espa);
		
	    p3.aprender(pl);
	   //  p3.aprender(espa);
	    p3.aprender(new Espanol());
	    System.out.println(p3);
	    try {
			p3.decir("Chau", pl);
		} catch (NoSabeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			p3.decir("chau", new Espanol());
		} catch (NoSabeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
		
		
		System.out.println("Fin de programa");
		
		
		
		
		
		
		
				
		
		
		
		
	}

}
