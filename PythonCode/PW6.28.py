proLang = ['Python', 'Java', 'C', 'C++', 'PHP', 'Javascript']
num1 = int(input('Enter and integer\n'))
try:
    print(proLang[num1])
except IndexError:
    print('Out Of Range')