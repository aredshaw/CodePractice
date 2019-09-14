f = open('stars.txt', 'a+')
lines = 0
stars = 1
while lines < 100:
    while stars < 100:
        f.write('*')
        lines = lines + 1
        
        if stars == lines:
            f.write('\n')
            #stars = 0
            stars = stars + lines
            
    
    lines = lines + 1

f = open('stars.txt', 'r')
print(f.read())
f.close()