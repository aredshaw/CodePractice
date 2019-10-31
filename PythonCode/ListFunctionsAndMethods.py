nums = [1, 2, 3]
nums.append(4) #adds 4 to the end of the list
nums.append(2)
nums.append("Yo dude!") # you can add words too
nums.append(1/8) # you can add floats as well
nums.append(17)
print(nums) # print the list
print(len(nums)) # the length of the list so far
nums.insert(1, 15) # inserting 15 at position 1
nums.remove(2) #removing the first 2 in the list
nums.remove(2) #removing the second 2 in the list
nums.insert(2, 4) #adding a 4 in position 2
print(nums)
nums.reverse() #reversing the order of the list
print(nums)
print(nums.count(4)) #couunding the 4s in the list and printing out the count
print(nums.index(4)) #prints the index of the first 4