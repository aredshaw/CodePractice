def count():
    x=1
    while x<10000:
        yield x
        x+=1

for x in count():
    print(x)