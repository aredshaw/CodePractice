testScore = input('Enter an integer from 1 to 100\n')
testScore = int(testScore)
if testScore >= 70 and  testScore <= 100:
    print('A')
elif testScore >= 60 and testScore <= 69:
    print('B')
elif testScore >= 50 and testScore <= 59:
    print('C')
elif testScore >= 0 and testScore <= 49:
    print('Fail')
else:
    print('Invalid')