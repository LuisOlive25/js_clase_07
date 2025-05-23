package ar.com.educacionit.entidades;

import java.util.Arrays;

import ar.com.educacionit.exception.checked.NoSabeException;
import ar.com.educacionit.interfaces.IIdioma;

public class Persona {
	
	
	// Los Atributos siempre van a ser privados
	
		private String nombre;
		private String apellido;
		private IIdioma idiomaNativo;
		private IIdioma[] idiomas;
		
		
		public Persona() {}

		
		
		public Persona(String nombre, String apellido, IIdioma idiomaNativo) {
		
			this.nombre = nombre;
			this.apellido = apellido;
			this.idiomaNativo = idiomaNativo;
			this.idiomas = new IIdioma[0];
			
		}
		
		
		public void aprender(IIdioma nuevoIdioma) {
			
			// hay que controlar que el nuevoIdioma no este en la lista
			// tarea para hogar
			IIdioma[] actuales = new IIdioma[this.idiomas.length + 1];
			int i = 0;
			for (IIdioma idiomaQueSabe : this.idiomas) {
				actuales[i++] = idiomaQueSabe;
			}
			actuales[i]=nuevoIdioma;
			this.idiomas = actuales;
			
		}
		
		
		
		
		
		public void decir(String palabra) {
			this.idiomaNativo.decir(palabra);
		}


        public void decir(String palabra,IIdioma unIdioma) throws NoSabeException {
        	boolean sabeEseIdioma = false;
        	
        	for (IIdioma idiomaQueSabe : this.idiomas) {
        		if(idiomaQueSabe.equals(unIdioma)) {
        			sabeEseIdioma = true;
        			break;
        		}
        	}
        	
        	
        	if(sabeEseIdioma) {
        		unIdioma.decir(palabra);;
        		
        	}else {
        		//unIdioma.noSeDecir(palabra);
        		throw new NoSabeException(this.nombre + " - " + this.apellido + "," + palabra
        				, null);
        	}
        	
        }
        
		
		
		
		
		
		

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", idiomaNativo=" + idiomaNativo
					+ ", idiomas=" + Arrays.toString(idiomas) + "]";
		}



	
		
		
		
		

		
		// Constructor -> Metodo especial 8Es una funcion) 
		// new Persona()
		// siempre va a ser = publico quiere decir siempre puedo usar los atributos fuera de clases
		
		
	
	
	
	

}
