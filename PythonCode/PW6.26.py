count = 0
factorial = 1
num1 = int(input('Enter a positive integer:\n'))
count = num1
if num1 < 0:
    print('The number is not positive.')
else:
  while count > 0:
    factorial = factorial * num1
    count = count - 1
    num1 = num1 - 1
  print(factorial)