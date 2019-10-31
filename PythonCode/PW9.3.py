class HumanResource:
    def __init__(self, pName, pSalary, pBonus):
        self.name = pName
        self.salary = pSalary
        self._bonus = pBonus
    
    def __str__(self):
        if self._bonus < 0:
            return 'Bonus cannot be negative'
        else:
            return 'Name = %s, Salary = %.2f, Bonus = %.2f' %(self.name, self.salary, self._bonus)
        


chiefOps = HumanResource(pName = 'Kely', pSalary = 715000, pBonus = 0)
print(chiefOps)
chiefOps._bonus = -20
print(chiefOps)