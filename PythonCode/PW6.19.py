p = input('Please enter the number of rows\n')
q = input('Please enter the number of asterists per row\n')
p = int(p)
q = int(q)
ast = p
rows = q
while rows > 0:
  while ast > 0:
    print('*', end = '')
    ast += -1
  else:
    print('\n')
    ast = p
    rows = rows -1
