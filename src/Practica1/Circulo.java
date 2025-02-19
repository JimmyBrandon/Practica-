package Practica1;

public class Circulo {
	private
	float Radio;
	Punto Centro;
	
	public Circulo (Punto Centro, float Radio) {
		this.Centro=Centro;
		this.Radio=Radio;
	}

	@Override
	public String toString() {
		return "Circulo [Radio=" + Radio + ", Centro=" + Centro + "]";
	}
	
	public void DibujandoCirculo() {
		
	}

}
