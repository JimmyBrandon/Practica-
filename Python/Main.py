import tkinter as tk

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

class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Circulo [Centro={self.centro}, Radio={self.radio}]"

    def dibuja_circulo(self, canvas):
        x = self.centro.get_x() - self.radio
        y = self.centro.get_y() - self.radio
        diameter = 2 * self.radio
        canvas.create_oval(x, y, x + diameter, y + diameter, outline="black")

class CirculoCanvas(tk.Canvas):
    def __init__(self, parent, circulo):
        super().__init__(parent)
        self.circulo = circulo
        self.circulo.dibuja_circulo(self)

def main():
    root = tk.Tk()
    root.title("Dibujar Circulo")

    centro = Punto(200, 200)
    radio = 100
    circulo = Circulo(centro, radio)
    canvas = CirculoCanvas(root, circulo)

    canvas.pack(fill=tk.BOTH, expand=True)
    root.geometry("400x400")
    root.mainloop()

if __name__ == "__main__":
    main()
