def apply_twice(func, arg): #func and args are just place holders. They could be (x, y). x+5(x+5, 10)
    return func(func(arg)) #Which means this is saying the same as x(x, y)

def add_five(x): #this just adds 5 to whatever x is.
    print(x) #evidently s = 10, but I don't know why.
    return x + 5
    

print(apply_twice(add_five, 10)) #applytwice, whichmeans x+5(x+5, 10)

# add_five is defined as the "func" in the first function and the 10 is the "arg". So: 
# func(func(arg)) , the same as add_five(add_five(10).
# At this point we need to go to the second function (add_five). It is going to be 10+5
# add_five(add_five(10)
# add_five(10+5)
# 15+5 = 20