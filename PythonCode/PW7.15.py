from itertools import permutations

def sumOfTwoNumbers(target, *b):
    count = 0
    perm = permutations([*b],2)
    for i in perm:
            if i[0] + i[1] == 12:
                count = count + 1
                ans ='%d + %d equals 12.' %(i[0], i[1])
                print(ans)
                              
            else:             
                print('No result found')

sumOfTwoNumbers(12, 3, 7, 4, 5, 6, 13)