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
        int angulo = (int)Math.atan((double)this.y / this.x);
        angulo = (int)Math.toDegrees(angulo);
        return new int[] {radio, angulo};
    }
}

class Circulo {
    private Punto centro;
    private float radio;

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [Centro=" + centro.toString() + ", Radio=" + radio + "]";
    }

    public void dibujaCirculo(Graphics g, int panelWidth, int panelHeight) {
        int x = panelWidth / 2 + centro.getX() - (int)radio;
        int y = panelHeight / 2 - centro.getY() - (int)radio;
        int diameter = (int)(2 * radio);
        g.drawOval(x, y, diameter, diameter);
    }
}

class CirculoPanel extends JPanel {
    private Circulo circulo;

    public CirculoPanel(Circulo circulo) {
        this.circulo = circulo;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int panelWidth = getWidth();
        int panelHeight = getHeight();
        circulo.dibujaCirculo(g, panelWidth, panelHeight);
    }
}

public class Main {
    public static void main(String[] args) {
        Punto centro = new Punto(-50, -50); 
        float radio = 50;

        Circulo circulo = new Circulo(centro, radio);

        JFrame frame = new JFrame("Dibujar Circulo");
        CirculoPanel panel = new CirculoPanel(circulo);

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

