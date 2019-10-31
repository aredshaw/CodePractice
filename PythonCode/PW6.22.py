a = int(input('Enter a number:\n'))
b = int(input('Enter another number:\n'))
b = b +1
#arr = []
num = 1

count = 0
for i in range(a, b):
    #arr.append(i)
    num = num * i
    count += 1
print(num)    
