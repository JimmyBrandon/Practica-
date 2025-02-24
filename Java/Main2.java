package practicas;

import javax.swing.*;
import java.awt.*;

class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    public int[] coord_cartesianas() {
        return new int[] {this.x, this.y};
    }
    
    public int[] coord_polares() {
        int radio = (int)Math.sqrt(this.x * this.x + this.y * this.y);
        int angulo = (int) Math.atan((double)this.y / this.x);
        angulo = (int)Math.toDegrees(angulo);
        return new int[] {radio, angulo};
    }
}

class Linea {
    private Punto p1;
    private Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Linea [P1=" + p1.toString() + ", P2=" + p2.toString() + "]";
    }

    public void dibujaLinea(Graphics g, int width, int height) {
        int x_offset = width / 2;
        int y_offset = height / 2;
        
        g.drawLine(p1.getX() + x_offset, y_offset - p1.getY(), p2.getX() + x_offset, y_offset - p2.getY());
    }
}

class LineaPanel extends JPanel {
    private Linea linea;

    public LineaPanel(Linea linea) {
        this.linea = linea;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        linea.dibujaLinea(g, width, height);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Punto punto1 = new Punto(0, 0); 
        Punto punto2 = new Punto(50, 50); 

        Linea linea = new Linea(punto1, punto2);

        JFrame frame = new JFrame("Dibujar Linea");
        LineaPanel panel = new LineaPanel(linea);

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}



