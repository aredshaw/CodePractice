p = 111
q = 13
result = p/q
# This sets the decimal to three places, and the spaces that the number takes up, including spaces before the number at 5. If I set it to 7.3, then there would be two more spaces before the number since the number only takes up five spaces with the decimal point.
message = 'You know, %5.3f really is an excellent number.' %(result)
print(message)