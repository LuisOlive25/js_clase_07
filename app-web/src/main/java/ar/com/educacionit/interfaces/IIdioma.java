package ar.com.educacionit.interfaces;

public interface IIdioma {
	
	// crear contrato
	public void decir(String palabra); // Solo coloco la firma hasta version 8 de Java

	// Todas las clases que implementan en esta interfaz estaran disponibles 
	
	
	public default void noSeDecir(String palabra) {
		System.out.println("No sé decir..." + palabra);
		
	}
	
	
}
