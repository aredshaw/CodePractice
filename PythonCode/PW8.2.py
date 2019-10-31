f = open('ch8q2.txt', 'w')
f.write('12\n32\n15\n9\n16\n-3\n45\n-10')
f.close()

f = open('ch8q2.txt', 'r')
i = 0
for line in f:
    line = int(line)
    if line > 0:
     i = i + line
    
print(i)
f.close()