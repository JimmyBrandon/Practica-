import math
import Punto

class Circulo:
    def __init__(self, centro: Punto, radio: float):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Círculo con centro en {self.centro.coord_cartesianas()} y radio {self.radio}"
    def dibuja_circulo(self):
        print(f"Dibujando un círculo en {self.centro.coord_cartesianas()} con radio {self.radio}")

centro = Punto(2.0, 3.0)
circulo = Circulo(centro, 5.0)
print(circulo)
circulo.dibuja_circulo()