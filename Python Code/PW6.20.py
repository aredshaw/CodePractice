message = input('Enter a message. Go ahead, I\'ll wait!\n')
count = 0
for i in message:
    if i != 'a':
       print(i, end = "")

           
    elif i == 'a':
        count += 1
        if count > 3: 
           i = 'A'
           print(i, end = '')
        else:
           i = '@'
           print(i, end = '')