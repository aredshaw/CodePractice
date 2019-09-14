userInput = input('Please enter an integer\n')
userInput = int(userInput)
if userInput > 0:
    print(userInput)

if userInput < 0:
    userInput *= -1
    print(userInput)

if userInput == 0:
    print('You entered zero')