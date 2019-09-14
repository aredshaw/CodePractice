print((lambda x: x*2)  (7)) #using a lambda

double = lambda x: x * 2 #assigning a lambda to a variable. There is really no reason to do this. A function is better.
print(double(7))

def mult(x): #this uses a function to do the same thing. It is better in most cases, but lambdas (the first example) is useful for speed at times.
    return x * 2
print(mult(7))