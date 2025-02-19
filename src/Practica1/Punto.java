package Practica1;
public class Punto {
	private
	float x;
	float y;
	
	public Punto(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public String coord_cartesianas() {
		return "(" + x + ", " + y +")";
	}
	public String coord_polares() {
		double r = Math.sqrt(x * x +y * y);
		double theta = Math.atan2(y,x);
		        return"(r: " + r + ", 0: " + Math.toDegrees(theta) + ")";
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	
	
	
	
	
	

	
	
	

}
