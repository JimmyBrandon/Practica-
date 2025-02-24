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

class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Linea [P1={self.p1}, P2={self.p2}]"

    def dibuja_linea(self, canvas):
        canvas_width = int(canvas['width'])
        canvas_height = int(canvas['height'])
        
        x_offset = canvas_width // 2
        y_offset = canvas_height // 2

        canvas.create_line(
            self.p1.get_x() + x_offset, y_offset - self.p1.get_y(),
            self.p2.get_x() + x_offset, y_offset - self.p2.get_y(),
            fill="black"
        )

class LineaCanvas(tk.Canvas):
    def __init__(self, parent, linea):
        super().__init__(parent, width=400, height=400)
        self.linea = linea
        self.update_linea()

    def update_linea(self):
        self.delete("all")
        self.linea.dibuja_linea(self)

def main():
    root = tk.Tk()
    root.title("Dibujar Linea")

    punto1 = Punto(0, 0) 
    punto2 = Punto(50, 50)  
    linea = Linea(punto1, punto2)
    canvas = LineaCanvas(root, linea)
    canvas.pack(fill=tk.BOTH, expand=True)

    root.geometry("400x400")
    root.mainloop()

if __name__ == "__main__":
    main()
