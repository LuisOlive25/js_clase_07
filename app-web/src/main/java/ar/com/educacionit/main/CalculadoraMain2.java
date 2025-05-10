package ar.com.educacionit.main;

import ar.com.educacionit.entidades.Calculadora;

public class CalculadoraMain2 {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 0;
		
		
		
		try {
			Calculadora.dividir(a,  b);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		

			
		System.out.println("Fin");
		
		

		

		}

		
}