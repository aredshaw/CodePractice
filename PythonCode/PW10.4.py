class Student:
    def __init__(self, pName, pId, pCourse_enrolled, pAnnual_fees):
        self.name = pName
        self.id = pId
        self.course_enrolled = pCourse_enrolled
        self.annual_fees = pAnnual_fees
    
    def __str__(self):
        return 'Name, %s\nID, %s\nCourse, %s\nAnnual Fees, %d' %(self.name, self.id, self.course_enrolled, self.annual_fees)
        
    def lt(self):
        return
        
    def gt(self):
        return

class ArtsStudent(Student):
    def __init__(self, pName, pId, pCourse_enrolled, pAnnual_fees, pProject_grade):
        super().__init__(pName, pId, pCourse_enrolled, pAnnual_fees)
        self.project_grade = pProject_grade
    # Not in my origial. It only returns the project grade, not other parameters.    
    def __str__(self):
        return 'The project grade is %s\n' %(self.project_grade)

class CommerceStudent(Student):
    def __init__(self, pName, pId, pCourse_enrolled, pAnnual_fees, pInternship_company):
        super().__init__(pName, pId, pCourse_enrolled, pAnnual_fees)
        self.internship_company = pInternship_company

class TechStudent(Student):
    def __init__(self, pName, pId, pCourse_enrolled, pAnnual_fees, pInternship_company, pProject_grade):
        super().__init__(pName, pId, pCourse_enrolled, pAnnual_fees)
        self.internship_company = pInternship_company
        self.project_grade = pProject_grade


try1 = Student('Joe Halderman', 234355, 'Math 101', 2500)
print(try1, '\n')


student1 = ArtsStudent('Peter Johnson', 'A19012', 'History', 11000, 'A')
# My original answer. It gives every parameter.
# print('Student 1:\n', student1, '\n', student1.project_grade, '\n')
print(student1)

student2 = CommerceStudent('Alan Goh', 'C19111', 'Digital Marketing', 13400, 'Digital Consultancy')
print('Student 2:\n', student2, '\n', student2.internship_company, '\n')



student3 = TechStudent('Larry Faith', 'T190126', 'Computer Science', 21000, 'A', 'Kyla Tech')
print('Student 3\n', student3, student3.internship_company, student3.project_grade, '\n')

if student1.annual_fees > student2.annual_fees:
    print('Between Student 1 and Student 2, student 1 pays more.')
else:
    print('Between Student 1 and Student 2, student 2 pays more.')
