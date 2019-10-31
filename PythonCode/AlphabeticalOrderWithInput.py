x = input("Enter a word\n")
y = input("Enter another word\n\n")
if y > x: #you can compare words to see if they are in alphabetical order. ">" means it comes later in the alphabet. For instance "he" comes before "hi" in the alphabet.
    print("These are in alphabetical order!")
else:
    print("These are not in alphabetical order.\nThey should be:\n" + y + "\n" + x)