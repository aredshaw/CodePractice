nums = input('Please enter 5 numbers, separated by commas:\n')
nums1 = nums.split(',')

#print('You entered ' + nums1[0] + ', ' + nums1[1] + ', ' + nums1[2] + ', ' + nums1[3] + ', ' + nums1[4] + ', ' )

print('You entered ' + nums1[0] + ', ' + nums1[1] + ', ' + nums1[2] + ', ' + nums1[3] + ', ' + nums1[4] +'.')

nums1[0] = int(nums1[0])
nums1[1] = int(nums1[1])
nums1[2] = int(nums1[2])
nums1[3] = int(nums1[3])
nums1[4] = int(nums1[4])



total = (nums1[0] + nums1[1] + nums1[2] + nums1[3] + nums1[4])
total = str(total)
print('The sum is: ' + total)