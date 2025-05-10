package ar.com.educacionit.main;

import ar.com.educacionit.entidades.Calculadora;
import ar.com.educacionit.exception.checked.DivisionPorCeroException;

public class CalculadoraMain {

	public static void main(String[] args) throws DivisionPorCeroException {
		
		int a = 10;
		int b = 5;
		
		
		
		
		// Si no quiero controlar el error con try/cath, agrego throws en el metodo
		int res = Calculadora.dividir(a, b);
		System.out.println(res);
		

	}

}
