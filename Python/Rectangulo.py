class Rectangulo:
    def __init__(self, a ,b):
        self.base=a
        self.altura=b
    def perimetro(self):
        return 2*(self.base + self.altura)
    def area(self):
        return self.base * self.altura

r1 = Rectangulo(2,3)
print(r1.perimetro())
print(r1.area())