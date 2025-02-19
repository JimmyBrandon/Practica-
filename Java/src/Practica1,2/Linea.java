package Practica1;

public class Linea {
    private Punto p1;
    private Punto p2;

    // Constructor
    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Línea desde " + p1.coord_cartesianas() + " hasta " + p2.coord_cartesianas();
    }

 
    public void dibujaLinea() {
        System.out.println("Dibujando una línea desde " + p1.coord_cartesianas()+ " hasta " + p2.coord_cartesianas());
    }

    public static void main(String[] args) {
        Punto punto1 = new Punto(1.0f, 2.0f);
        Punto punto2 = new Punto(4.0f, 6.0f);
        Linea linea = new Linea(punto1, punto2);
        System.out.println(linea);
        linea.dibujaLinea();
    }
}
