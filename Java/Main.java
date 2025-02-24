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

    public void dibujaLinea(Graphics g) {
        g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
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
        linea.dibujaLinea(g);
    }
}

public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(50, 50);
        Punto punto2 = new Punto(200, 200);

        Linea linea = new Linea(punto1, punto2);

        JFrame frame = new JFrame("Dibujar Linea");
        LineaPanel panel = new LineaPanel(linea);

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
