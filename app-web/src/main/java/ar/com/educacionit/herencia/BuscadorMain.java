package ar.com.educacionit.herencia;

public class BuscadorMain {

	
	

		public static void main(String[] args) {
			
			
			   Buscador bs = new Buscador();  // puse con mayuscula la U sin querer
		         bs.buscar();
		         Integer cantidad = bs.getCantidadResultados();
		         //System.out.println(bs.getResultados());
		         if ( bs.hayResultados()) {
		        	 Articulo[] articulos = bs.getResultados();
		        	
		        	 
		        	 
		        	 // recorremos los articulos y presentamos en consola
		        	 for (Articulo articulo : articulos) {
		        
		        		 System.out.println(articulo);
		        	 }
		         }
		         
		
		
		
		
		
	}

}
