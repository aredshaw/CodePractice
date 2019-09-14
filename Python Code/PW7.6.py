def absValue(num1):
  try:
    if num1 < 0:
        num1 = num1 * -1
        return num1
    elif num1 >= 0:
        return num1
  except TypeError:
        return
answer = absValue(-8.2)
print(answer)