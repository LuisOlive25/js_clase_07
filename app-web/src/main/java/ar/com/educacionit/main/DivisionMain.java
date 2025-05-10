package ar.com.educacionit.main;

import ar.com.educacionit.exception.checked.DivisionPorCeroException;

public class DivisionMain {

	public static void main(String[] args) throws DivisionPorCeroException {
		
		
		int valor1 = 10;
		int valor2 = 0;
		
		
		
       try {
    	   int res = valor1 / valor2;
    	   System.out.println(res);
		
	} catch (Exception e) {
		System.err.println(e);
		System.out.println("No se pudo hacer la division");
		throw new DivisionPorCeroException("No se puede dividir por cero");
		
	}
		
		
		System.out.println("FIN");
		

	}

}
