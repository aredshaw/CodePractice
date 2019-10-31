class Car:
    def __init__(self, pMake, pModel, pColor, pPrice):
        self.make = pMake
        self.model = pModel
        self.color = pColor
        self.price = pPrice
        
    def __str__(self):
        return 'Make = %s, Model = %s, Color = %s, Price = %s' %(self.make, self.model, self.color, self.price)

    def selecColor(self):
        self.color = input('What is the new color? ')
        
    def calculateTax(self):
        priceWithTax = 1.1*self.price
        return priceWithTax
        
myFirstCar = Car(pMake = 'Honda', pModel = 'Civic', pColor = 'White', pPrice = '15000')
print(myFirstCar)

# changing the price from 15000 to 18000
myFirstCar.price = 18000
print(myFirstCar)

myFirstCar.color = 'Orange'
print(myFirstCar)

finalPrice = myFirstCar.calculateTax()
print('The final price is $%s' %(finalPrice))