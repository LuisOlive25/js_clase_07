package ar.com.educacionit.herencia;

public class Buscador {



//		Atributos
		private String claveBusqueda;
		private Integer cantidadResultados;
		private Articulo [] resultados;
//		alt + shif + s	
		public Buscador() {
			
			this.resultados = new Articulo[0];
			this.cantidadResultados = 0;
			this.claveBusqueda = "";
			
		
	}



		public String getClaveBusqueda() {
			/*if( claveBusqueda == null) {
				return "";
				
			}
			return claveBusqueda; */
			
			// Ternario
			//return this.claveBusqueda == null? "" : this.claveBusqueda;
			return this.claveBusqueda;
		}
			
			
			
		public void setClaveBusqueda(String claveBusqueda) {
//			if(claveBusqueda != null) {
//			this.claveBusqueda = claveBusqueda;
			
			this.claveBusqueda = claveBusqueda.toLowerCase();
//			zapatilla
//			zapatillas
		}


		public Integer getCantidadResultados() {
			// if( this.resultados == null) {
			//	return 0;
			//  } else {
			//	return this.resultados.length; // tamaño del array
			return this.resultados.length;
		}
		
				
				
				
			


		public Articulo[] getResultados() {
			
			// if( this.resultados == null) {
			// 	return new String[0];
			//}
			return this.resultados;
			
		}
		
		
		public void buscar() {
			// select * form articulos where titulo like '%this.claveBusqueda%'
			Articulo[] resultados = new Articulo[] {
					new Ropa("Pantalon Largo", 220f, "L"),
					new Electronica("Celular", 22.24f,"Sony"),
					new Bazar("Botella", 55.24f, 1),
					new Ropa("Buzo", 44.24f, "S"),
					new Electronica("Tablet", 25.66f,"Samsung")
			};
			
			this.resultados = resultados;
			this.cantidadResultados = resultados.length;
		
		}
		
		
		public boolean hayResultados() {
			return this.cantidadResultados == 0 ? false : true;
			
		}
		
		
		
}		
		
		
		
		
		
		
		
		


		
			
		
		
		
		
		
		
		
		
	


