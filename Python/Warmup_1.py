# Warm Up 1 Problems

# Warmup-1 > sleep_in
#
# The parameter weekday is True if it is a weekday, and the parameter vacation is True if we are on vacation. 
# We sleep in if it is not a weekday or we're on vacation. Return True if we sleep in.

def sleep_in(weekday, vacation):
    if not weekday or vacation:
        return True
    else:
        return False


print('*** Testing sleep_in ***')
assert(sleep_in(False, False) == True)
assert(sleep_in(True, False) == False)
assert(sleep_in(False, True) == True)
assert(sleep_in(True, True) == True)
print('*** End Testing ***')

# Warmup-1 > monkey_trouble
#
# We have two monkeys, a and b, and the parameters a_smile and b_smile 
# indicate if each is smiling. We are in trouble if they are both smiling or 
# if neither of them is smiling. Return True if we are in trouble.

def monkey_trouble(a_smile, b_smile):
  return a_smile == b_smile

print('*** Testing monkey_trouble ***')
assert(monkey_trouble(True, True) == True)
assert(monkey_trouble(False, False) == True)
assert(monkey_trouble(True, False) == False)
assert(monkey_trouble(False, True) == False)
print('*** End Testing ***')

# Warmup-1 > sum_double
# Given two int values, return their sum. Unless the two values are the same, 
# then return double their sum.

def sum_double(a, b):
  if a == b:
    return (a + b) * 2
  else:
    return a + b

print('*** Testing sum_double ***')
assert(sum_double(1, 2) == 3)
assert(sum_double(3, 2) == 5)
assert(sum_double(2, 2) == 8)
assert(sum_double(-1, 0) == -1)
assert(sum_double(3, 3) == 12)
assert(sum_double(0, 0) == 0)
assert(sum_double(0, 1) == 1)
assert(sum_double(3, 4) == 7)
print('*** End Testing ***')

# Warmup-1 > diff21
# Given an int n, return the absolute difference between n and 21, 
# except return double the absolute difference if n is over 21.
def diff21(n):
  if n > 21:
    return abs(n -21) *2
  else:
    return abs(n - 21)

print('*** Testing diff21 ***')
assert(diff21(19) == 2)
assert(diff21(10) == 11)
assert(diff21(21) == 0)
assert(diff21(22) == 2)
assert(diff21(25) == 8)
assert(diff21(30) == 18)
assert(diff21(0) == 21)
assert(diff21(1) == 20)
assert(diff21(2) == 19)
assert(diff21(-1) == 22)
assert(diff21(-2) == 23)
assert(diff21(50) == 58)
print('*** End Testing ***')

# Warmup-1 > parrot_trouble
# We have a loud talking parrot. The "hour" parameter is the current hour 
# time in the range 0..23. We are in trouble if the parrot is talking 
# and the hour is before 7 or after 20. Return True if we are in trouble.
def parrot_trouble(talking, hour):
   return talking and (hour < 7 or hour > 20)
   
print('*** Testing parrot_trouble ***')
assert(parrot_trouble(True, 6) == True)
assert(parrot_trouble(True, 7) == False)
assert(parrot_trouble(False, 6) == False)
assert(parrot_trouble(True, 21) == True)
assert(parrot_trouble(False, 21) == False)
assert(parrot_trouble(False, 20) == False)
assert(parrot_trouble(True, 23) == True)
assert(parrot_trouble(False, 23) == False)
assert(parrot_trouble(True, 20) == False)
assert(parrot_trouble(False, 12) == False)
print('*** End Testing ***')

# Warmup-1 > makes10
# Given 2 ints, a and b, return True if one if them is 10 or if their 
# sum is 10.
def makes10(a, b):
  return a == 10 or b == 10 or (a+b) == 10

print('*** Testing makes10 ***')
assert(makes10(9, 10) == True)
assert(makes10(9, 9) == False)
assert(makes10(1, 9) == True)
assert(makes10(10, 1) == True)
assert(makes10(10, 10) == True)
assert(makes10(8, 2) == True)
assert(makes10(8, 3) == False)	
assert(makes10(10, 42) == True)	
assert(makes10(12, -2) == True)
print('*** End Testing ***')
