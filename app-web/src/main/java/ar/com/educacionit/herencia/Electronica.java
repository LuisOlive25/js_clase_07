package ar.com.educacionit.herencia;

public class Electronica extends Articulo {

	private String marca;

	public Electronica(String nombre, String marca) {
		super(nombre);
		this.marca = marca;
	}
	
	
	public Electronica(String nombre, float precio, String marca) {
		super(nombre, precio);
		this.marca = marca;
	
	}


	@Override
	public String toString() {
		return "Electronica [marca=" + marca + ", " + super.toString() + "]";
	}
	
	
	
}

	
