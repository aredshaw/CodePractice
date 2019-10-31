count = 0
myList = []
while count < 4:
  num = input('Please enter a number:\n')
  num = int(num)

  count += 1
  myList.append(num)

print('The smallest number is', min(myList))
print('The largest number is', max(myList))