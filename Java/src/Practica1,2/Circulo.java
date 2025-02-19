package Practica1;

public class Circulo {
	private
	Punto centro;
	float radio;
	
	public Circulo(Punto centro, float radio) {
		this.centro = centro;
		this.radio = radio;
	}
	

	@Override
	public String toString() {
		return "Circulo [centro=" + centro + ", radio=" + radio + "]";
	}
	
	public void dibujaCirculo(){
		System.out.println("Dibujando un circulo en" + centro + "con radio" + radio);
	}


	public static void main(String[] args) {
		Punto centro = new Punto(2.0f, 3.0f);
		Circulo circulo = new Circulo(centro, 5.0f);
		System.out.println(circulo);
		circulo.dibujaCirculo();

	}

}
