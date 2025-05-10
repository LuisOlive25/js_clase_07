package ar.com.educacionit.main;

import ar.com.educacionit.entidades.Calculadora;

public class CalculadoraMain3 {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 0;
		
		boolean continuar = true;
//		do while se ejecuta aunque sea una vez.
//		Y al final evalua una condicion
		
		do {
			
		} while (continuar);
		
		try {
			Calculadora.dividir(a,  b);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		

			
		System.out.println("Fin");
		
		

		

		}

		
}