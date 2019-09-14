def capitalsOfCountries(**a):
  arrLen = len(a)
  if arrLen > 1:
      for i, j in a.items():
        mess1 = 'The capitals of %s are %s.' %(i, j)
        print(mess1)
  elif arrLen == 1:
      for i, j in a.items():      
        mess2 = 'The capital of %s is %s.' %(i, j)
        print(mess2)
      
capitalsOfCountries(Japan = 'Tokyo', Indonesia = 'Jakarta', France = 'Paris')

# figure out how to use enumerate in this program.