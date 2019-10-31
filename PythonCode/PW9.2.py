class Room:
    def __init__(self, pSize, pView, pType, pBasicRates):
        self.size = pSize
        self.view = pView
        self.type = pType
        self.basicRates = pBasicRates
        
    def __str__(self):
        return 'Size = %s, View = %s, Type = %s, Basic Rates = %s' %(self.size, self.view, self.type, self.basicRates)
    
    def calculateRates(self, day):
        #basicRates = 200
        if day == 'Weekends':
            return int(self.basicRates) * 1.5
        if day == 'Public Holidays':
            return int(self.basicRates) * 2
        if day == 'Christmas':
            return int(self.basicRates) * 2.5
        else:
            return self.basicRates
        
room1 = Room(pSize = '120', pView = 'City', pType = 'Double', pBasicRates = '120')
print(room1)
newRates = room1.calculateRates('Public Holidays')
ans = 'The new rate is $%d' %(newRates)
print(ans)