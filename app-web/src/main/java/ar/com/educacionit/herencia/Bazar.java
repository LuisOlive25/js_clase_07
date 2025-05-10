package ar.com.educacionit.herencia;

public class Bazar extends Articulo {
	
	// Atributos
	private int capacidad;
	

	public Bazar(String nombre, int capacidad) {
		super(nombre); // llama el constructor del que extiende
		this.capacidad = capacidad;
	}

	public Bazar(String nombre, float precio, int capacidad) {
		super(nombre,  precio); 
		this.capacidad = capacidad;
	
}

	@Override
	public String toString() {
		return "Bazar [capacidad=" + capacidad + ", toString()=" + super.toString() + "]";
	}

	
	
	
}