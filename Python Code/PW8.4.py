getNumbers = input('Enter some integers or \'Q\' to quit.\n')

while getNumbers != 'Q':
    f = open('ch8q2.txt', 'a')
    f.write(getNumbers)
    f.write('\n')
    getNumbers = input('Enter some integers or \'Q\' to quit.\n')
    f.close()
    

f = open('ch8q2.txt', 'r')
i = 0
for line in f:
    line = int(line)
    if line > 0:
     i = i + line
    
print(i)
f.close()