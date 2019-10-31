from math import pi

class Shape:
    def __init__(self, pType, pArea):
        self.type = pType
        self.area = pArea
        
    def __str__(self):
        return '%s of area %4.2f units square.' %(self.type, self.area)
        
    
class Square(Shape):
    def __init__(self, pLength):
        super().__init__('Square', 0)
        self.length = pLength
        self.area = self.length*self.length
        
class Triangle(Shape):
    def __init__(self, pBase, pHeight):
        super().__init__('Triangle', 0)
        self.base = pBase
        self.height = pHeight
        self.area = .5*self.base * self.height
            
class Circle(Shape):
    def __init__(self, pRadius):
        super().__init__('Circle', 0)
        self.radius = pRadius
        self.area = (pi * pRadius) * 2
            
sq = Square(5)
print(sq)

c = Circle(10)
print(c)

t = Triangle(12, 4)
print(t)

