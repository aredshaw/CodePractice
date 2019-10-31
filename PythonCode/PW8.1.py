file = open('ch8q1.txt', 'w')
file.write('Top Students:\nCarol\nZoe\nAndy\nCaleb\nXavier\nAaron\nBen\nAdam\nBetty')
file.close()

file = open('ch8q1.txt', 'r')
print(file.read())
file.close()