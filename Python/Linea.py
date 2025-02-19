from Punto import Punto
class Linea:
    def __init__(self, p1: Punto, p2: Punto):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Línea desde {self.p1.coord_cartesianas} hasta {self.p2.coord_cartesianas()}"

    def dibuja_linea(self):
        print(f"Dibujando una línea desde {self.p1.coord_cartesianas()} hasta {self.p2.coord_cartesianas()}")

punto1 = Punto(1.0, 2.0)
punto2 = Punto(4.0, 6.0)
linea = Linea(punto1, punto2)
print(linea)
linea.dibuja_linea()