class Student:
    passingMark = 60
    
    def __init__(self, name, marks):
        self.name = name
        self.marks = marks
    
    def __str__(self):
        return '%s received a %s.' %(self.name, self.marks)
        
    def passOrFail(self):
        if self.marks <= Student.passingMark:
            self.marks = 'fail'
        else:
            self.marks = 'pass'
        return self.marks
            
student1 = Student('John', 52)
print(student1)
status1 = student1.passOrFail()
print(status1)
student2 = Student('Jenny', 69)
print(student2)
status2 = student2.passOrFail()
print(status2)