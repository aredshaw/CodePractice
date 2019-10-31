def counting():
    y = 1
    while y<500:
        yield y #This is a great way to iterate through one number at a time. It will go forever if needed.
        y += 1
for y in counting():
    print(y)