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

class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Linea [P1={self.p1}, P2={self.p2}]"

    def dibuja_linea(self, canvas):
        canvas.create_line(self.p1.get_x(), self.p1.get_y(), self.p2.get_x(), self.p2.get_y(), fill="black")

class LineaCanvas(tk.Canvas):
    def __init__(self, parent, linea):
        super().__init__(parent)
        self.linea = linea
        self.linea.dibuja_linea(self)

def main():
    root = tk.Tk()
    root.title("Dibujar Linea")

    punto1 = Punto(50, 50)
    punto2 = Punto(200, 200)
    linea = Linea(punto1, punto2)
    canvas = LineaCanvas(root, linea)

    canvas.pack(fill=tk.BOTH, expand=True)
    root.geometry("400x400")
    root.mainloop()

if __name__ == "__main__":
    main()
