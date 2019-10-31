num = 0
prompt = int(input('Enter a positive integer or, to quite, enter -1\n'))

while prompt != -1:
    if prompt > 0:
     num += prompt
     print('The sum is ', num)
    elif prompt < -1:
      print('You entered a non positive integer')
    
    prompt = int(input('Enter a positive integer or, to quite, enter -1\n'))  


if prompt == -1:
	print('Goodbye!')