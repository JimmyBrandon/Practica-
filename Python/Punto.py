import math
class Punto:
    def __init__(self, x:float, y:float):
        self.x=x
        self.y=y
    def coord_cartesianas(self):
        return(self.x, self.y)
    def coord_polares(self):
        r = math.sqrt(self.x**2 + self.y**2)
        theta = math.atan2(self.y, self.x)
        return(r, theta)
    def __str__(self):
        return 
        {self.coord_cartesianas()}
p1= Punto(2, 3)
print(p1.coord_cartesianas())
print(p1.coord_polares())

        