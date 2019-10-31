x = [1, 2, 5, 12, 16]
t = "{4}, {3}, {2} {1}, {0}".format(x[0], x[1], x[2], x[3], x[4]) #if you put a comma after the numbers in curly braces, you get a comma in the output.
print(t)
t = "{4}, {3}, {2}, I left off the comma here. {1}, {0}".format(x[0], x[1], x[2], x[3], x[4]) #to go further, since there are no strings, you can write words in the output.
print(t)