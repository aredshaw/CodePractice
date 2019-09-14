class MethodDemo:
    message = 'Class message'
    
    def __init__(self, pMessage):
        self.message = pMessage
        
    @classmethod
    def printMessage(cls):
        print(cls.message)
        
        
    @staticmethod
    def yetAnotherMessage():
        print('This is a static message')
        

MethodDemo.printMessage()

MethodDemo.yetAnotherMessage()


md2 = MethodDemo(staticmethod)
md2.yetAnotherMessage()