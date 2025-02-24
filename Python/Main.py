import tkinter as tk
import math

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def get_x(self):
        return self.x

    def get_y(self):
        return self.y

    def __str__(self):
        return f"({self.x}, {self.y})"
    
    def coord_cartesianas(self):
        return self.x, self.y
    
    def coord_polares(self):
        radio = math.sqrt(self.x * self.x + self.y * self.y)
        angulo = math.atan(self.y / self.x)
        angulo = math.degrees(angulo)
        return radio, angulo

class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Circulo [Centro={self.centro}, Radio={self.radio}]"

    def dibuja_circulo(self, canvas):
        canvas_width = int(canvas['width'])
        canvas_height = int(canvas['height'])
        x_offset = canvas_width // 2
        y_offset = canvas_height // 2
        x = x_offset + self.centro.get_x() - self.radio
        y = y_offset - self.centro.get_y() - self.radio
        diameter = 2 * self.radio
        canvas.create_oval(x, y, x + diameter, y + diameter, outline="black")

class CirculoCanvas(tk.Canvas):
    def __init__(self, parent, circulo):
        super().__init__(parent, width=400, height=400)
        self.circulo = circulo
        self.update_circle()

    def update_circle(self):
        self.delete("all")
        self.circulo.dibuja_circulo(self)

def main():
    root = tk.Tk()
    root.title("Dibujar Circulo")

    centro = Punto(0, 0)  
    radio = 50
    circulo = Circulo(centro, radio)
    canvas = CirculoCanvas(root, circulo)
    canvas.pack(fill=tk.BOTH, expand=True)

    root.geometry("400x400")
    root.mainloop()

if __name__ == "__main__":
    main()
