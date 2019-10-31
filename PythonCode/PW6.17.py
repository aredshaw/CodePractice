num = 0
prompt = int(input('Enter a positive integer or, to quite, enter -1\n'))

while prompt != -1:
    num += prompt
    print('The sum is ', num)
    # I suspect the error I get now is because I am runing this in a web environment. It works fine on http://pythonfiddle.com/.
    prompt = int(input('Enter a positive integer or, to quite, enter -1\n'))
print('Goodbye!')