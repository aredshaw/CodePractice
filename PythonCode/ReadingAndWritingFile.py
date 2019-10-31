test_file = open("list.txt", "w" )
test_file.write("This is a test file. It is also a text file.\nI wonder how it will look altogether.\nWhen I write, I write a lot, \nso there is no telling where I will end up \nwith all the thoughts in my mind emptied out onto \nthe paper, or in this case, the screen.")
test_file.close()

test_file = open("list.txt", "r")
print(test_file.read(20)) #the first 20 characters
print(test_file.readlines(1)) #the next line
print(test_file.read(30)) #another 30 charaxters. It ends in the middle of a word.
print(test_file.read()) #the rest of the text. I added line breaks since my terminal does not wrap lines.
test_file.close()